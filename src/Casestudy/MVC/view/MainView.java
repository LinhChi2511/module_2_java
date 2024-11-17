package Casestudy.MVC.view;

import Casestudy.MVC.controller.StudentController;
import Casestudy.MVC.entity.Student;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Student student;
        List<Student> students;
        StudentController studentController = new StudentController();
        int choice;
        while (true){
            System.out.println("---Quản lý học sinh---");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Tìm kiếm học sinh theo id");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = inputChoice();
            switch(choice){
                case 1:
                    System.out.println("Hiển thị danh sách học sinh");
                    students = studentController.getAll();
                    display(students);
                    break;
                case 2:
                    System.out.println("Thêm mới học sinh");
                    student = inputStudent();
                    studentController.add(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                case 4:
                    System.out.println("Tìm kiếm học sinh theo ID");
                    System.out.print("Mời bạn nhập id: ");
                    int id = inputId();
                    if (studentController.isExist(id)){
                        System.out.println(studentController.findById(id));
                    } else {
                        System.out.println("Id not found");
                    }
                    break;

            }
        }
    }

    private static int inputChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        try{
            choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e){
            System.out.print("Nhập sai lựa chọn. Vui lòng nhập lại: ");
        } catch (Exception e){
            System.out.println("Lỗi");
        }
        return 0;
    }

    public static void display(List<Student> students){
        for (Student student : students){
            System.out.println(student);
        }
    }

    private static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập id: ");
        int id = inputId();
        while (id<=0){
            id = inputId();
        }
        System.out.print("Mời bạn nhập tên học sinh: ");
        String name = scanner.nextLine();
        while (!(name.matches("^[A-Za-z ]+$"))){
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại: ");
            name = scanner.nextLine();
        }

        System.out.print("Mời bạn nhập địa chỉ học sinh: ");
        String address = scanner.nextLine();
        while (!(address.matches("^[A-Za-z0-9 -]+$"))){
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại: ");
            address = scanner.nextLine();
        }

        System.out.print("Mời bạn nhập điểm của học sinh: ");
        double point = inputpoint();
        while (point <0){
            point = inputpoint();
        }

        System.out.print("Mời bạn nhập lớp: ");
        String className = scanner.nextLine();
        while (!(className.matches("^C[0-9]{4}[M|L]-JV103$"))){
            System.out.println("Bạn đã nhập sai định dạng");
            System.out.print("Vui lòng nhập lại: ");
            className = scanner.nextLine();
        }

        return new Student(id, name, address, point, className);
    }

    private static int inputId(){
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.print("Nhập lỗi. Vui lòng nhập lại: ");
        } catch (Exception e){
            System.out.println("Lỗi");
        }
        return 0;
    }

    private static double inputpoint(){
        Scanner scanner = new Scanner(System.in);
        try {
            double point = Double.parseDouble(scanner.nextLine());
            return point;
        } catch (NumberFormatException e){
            System.out.print("Nhập lỗi. Vui lòng nhập lại: ");
        } catch (Exception e){
            System.out.println("Lỗi");
        }
        return -1;
    }

}
