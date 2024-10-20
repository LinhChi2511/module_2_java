package ss8_cleancode_MVC.view;

import ss8_cleancode_MVC.controller.StudentController;
import ss8_cleancode_MVC.entity.Student;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Quản lý CodeGym---");
        System.out.println("1. Quản lý học sinh");
        System.out.println("2. Quản lý giảng viên");
        System.out.println("3. Thoát");
        System.out.println("Mời bạn nhập lựa chọn");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                menuStudent();
                break;
            case 2:
                System.out.println("Quản lý giảng viên");
                break;
        }

    }

    public static void menuStudent() {
        StudentController studentController = new StudentController();
        System.out.println("Quan ly hoc sinh");
        System.out.println("1.Hiển thị danh sách học sinh");
        System.out.println("2. Thêm mới học sinh");
        System.out.println("3. Sửa thông tin học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Tìm kiếm học sinh theo tên");
        System.out.print("Nhập lựa chọn");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("hiển thị danh sách");
                Student[] students = studentController.getAll();
                for (Student student: students) {
                    System.out.println(student);
                }
                break;
            case 2:
                System.out.println("thêm mới học sinh");
                break;
            case 3:
                System.out.println("sửa thông tin học sinh");
                break;
            case 4:
                System.out.println("xóa học sinh");
                break;
            case 5:
                System.out.println("tìm kiếm học sinh theo tên");
                break;
        }
    }
}
