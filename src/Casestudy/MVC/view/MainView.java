package Casestudy.MVC.view;

import Casestudy.MVC.controller.StudentController;
import Casestudy.MVC.controller.TeacherController;
import Casestudy.MVC.entity.Student;
import Casestudy.MVC.entity.Teacher;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("Quản lý trường học");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý giáo viên");
            System.out.println("3. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = inputChoice();
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    menuTeacher();
                    break;
                default:
                    return;

            }
        }
    }

    public static void menuStudent() {
        Student student;
        List<Student> students;
        StudentController studentController = new StudentController();
        while (true) {
            System.out.println("---Quản lý học sinh---");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Tìm kiếm học sinh theo id");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice = inputChoice();
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị danh sách học sinh");
                    students = studentController.getAll();
                    displayStudent(students);
                    break;
                case 2:
                    System.out.println("Thêm mới học sinh");
                    student = inputStudent();
                    studentController.add(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Tìm kiếm học sinh theo ID");
                    System.out.print("Mời bạn nhập id: ");
                    int id = inputIdToFind();
                    if (studentController.isExist(id)) {
                        System.out.println(studentController.findById(id));
                    } else {
                        System.out.println("Id not found");
                    }
                    break;
                case 4:
                    System.out.println("Xóa học sinh");
                    deleteStudent();
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void menuTeacher() {
        Teacher teacher;
        List<Teacher> teachers;
        TeacherController teacherController = new TeacherController();
        while (true) {
            System.out.println("---Quản lý giáo viên---");
            System.out.println("1. Hiển thị danh sách giảng viên");
            System.out.println("2. Thêm mới giảng viên");
            System.out.println("3. Tìm kiếm giảng viên theo id");
            System.out.println("4. Xóa giảng viên");
            System.out.println("5. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice = inputChoice();
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị danh sách giáo viên");
                    teachers = teacherController.getAll();
                    displayTeacher(teachers);
                    break;
                case 2:
                    System.out.println("Thêm mới giáo viên");
                    teacher = inputTeacher();
                    teacherController.add(teacher);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Tìm kiếm giáo viên");
                    System.out.print("Nhập id cần tìm kiếm: ");
                    int id = inputIdToFind();
                    if (teacherController.isExist(id)) {
                        System.out.println(teacherController.findById(id));
                    } else {
                        System.out.println("Id not found");
                    }
                    break;
                case 4:
                    System.out.println("Xóa học sinh");
                    deleteTeacher();
                    return;
            }
        }
    }

    private static void deleteTeacher() {
        TeacherController teacherController = new TeacherController();
        System.out.print("Mời bạn nhập id giáo viên muốn xóa");
        int id2 = inputIdToFind();
        if (teacherController.isExist(id2)) {
            System.out.println("Bạn có chắc chắn muốn xóa ");
            System.out.println(teacherController.findById(id2));
            System.out.print("Chọn 1 để xóa, hoặc phím bất kỳ để hủy: ");
            int choice2 = inputChoice();
            if (choice2 == 1) {
                teacherController.delete(id2);
                System.out.println("Đã xóa giáo viên");
            } else {
                System.out.println("Bạn đã không xóa");
            }
        } else
            System.out.println("Không tìm thấy id");
    }

    private static void deleteStudent() {
        StudentController studentController = new StudentController();
        System.out.print("Mời bạn nhập id học sinh muốn xóa");
        int id2 = inputIdToFind();
        if (studentController.isExist(id2)) {
            System.out.println("Bạn có chắc chắn muốn xóa ");
            System.out.println(studentController.findById(id2));
            System.out.print("Chọn 1 để xóa, hoặc phím bất kỳ để hủy: ");
            int choice2 = inputChoice();
            if (choice2 == 1) {
                studentController.deleteById(id2);
                System.out.println("Đã xóa học sinh");
            } else {
                System.out.println("Bạn đã không xóa");
            }
        } else
            System.out.println("Không tìm thấy id");
    }


    private static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            System.out.print("Nhập sai lựa chọn. Vui lòng nhập lại: ");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return 0;
    }

    public static void displayStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void displayTeacher(List<Teacher> teachers) {
        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }

    private static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập id: ");
        int id = inputIdStudent();
        while (id <= 0) {
            id = inputIdStudent();
        }
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Za-z ]+$"))) {
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại: ");
            name = scanner.nextLine();
        }

        System.out.print("Mời bạn nhập địa chỉ học sinh: ");
        String address = scanner.nextLine();
        while (!(address.matches("^[A-Za-z0-9 -]+$"))) {
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại: ");
            address = scanner.nextLine();
        }

        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double point = inputPoint();
        while (point < 0) {
            point = inputPoint();
        }

        System.out.print("Mời bạn nhập lớp: ");
        String className = scanner.nextLine();
        while (!(className.matches("^C[0-9]{4}"))) {
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại (Cxx24 vd:C0724): ");
            className = scanner.nextLine();
        }

        return new Student(id, name, address, point, className);
    }

    private static Teacher inputTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập id giáo viên: ");
        int id = inputIdTeacher();
        while (id <= 0) {
            id = inputIdTeacher();
        }
        System.out.print("Mời bạn nhập tên giáo viên: ");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Za-z ]+$"))) {
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại: ");
            name = scanner.nextLine();
        }

        System.out.print("Mời bạn nhập địa chỉ giáo viên: ");
        String address = scanner.nextLine();
        while (!(address.matches("^[A-Za-z0-9 -]+$"))) {
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại: ");
            address = scanner.nextLine();
        }

        System.out.print("Mời bạn nhập tuổi giáo viên: ");
        int age = inputAge();
        while (age < 18 || age >= 60 ) {
            age = inputAge();
        }
        System.out.print("Mời bạn nhập lớp: ");
        String className = scanner.nextLine();
        while (!(className.matches("^C[0-9]{4}"))) {
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại (Cxx24 vd:C0724): ");
            className = scanner.nextLine();
        }
        return new Teacher(id, name, address, age, className);
    }


    private static int inputIdToFind() {
        Scanner scanner = new Scanner(System.in);
        try {
            int id = Integer.parseInt(scanner.nextLine());
            return id;
        } catch (NumberFormatException e) {
            System.out.print("Nhập lỗi. Vui lòng nhập lại: ");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return 0;
    }

    private static int inputIdStudent() {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        try {
            int id = Integer.parseInt(scanner.nextLine());
            if (!studentController.isExist(id)) {
                return id;
            } else {
                System.out.print("Id đã tồn tại. Vui lòng nhập lại: ");
                return 0;
            }
        } catch (NumberFormatException e) {
            System.out.print("Nhập lỗi. Vui lòng nhập lại: ");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return 0;
    }

    private static int inputIdTeacher() {
        Scanner scanner = new Scanner(System.in);
        TeacherController teacherController = new TeacherController();
        try {
            int id = Integer.parseInt(scanner.nextLine());
            if (!teacherController.isExist(id)) {
                return id;
            } else {
                System.out.print("Id đã tồn tại. Vui lòng nhập lại: ");
                return 0;
            }
        } catch (NumberFormatException e) {
            System.out.print("Nhập lỗi. Vui lòng nhập lại: ");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return 0;
    }

    private static double inputPoint() {
        Scanner scanner = new Scanner(System.in);
        try {
            double point = Double.parseDouble(scanner.nextLine());
            return point;
        } catch (NumberFormatException e) {
            System.out.print("Nhập lỗi. Vui lòng nhập lại: ");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return -1;
    }

    private static int inputAge(){
        Scanner scanner = new Scanner(System.in);
        try {
            int age = Integer.parseInt(scanner.nextLine());
            return age;
        } catch (NumberFormatException e) {
            System.out.print("Nhập lỗi; vui lòng nhập lại ");
        }
        return 0;
    }
}

