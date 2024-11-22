package Casestudy.thi;

import java.util.List;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Repository repository = new Repository();
        DanhBa danhBa;
        int choice;
        while (true){
            System.out.println("---Chương trình quản lý danh bạ---");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = inputChoice();
            while (choice <= 0){
                System.out.print("Nhập lỗi. Vui lòng nhập lại: ");
                choice = inputChoice();
            }
            switch (choice){
                case 1:
                    System.out.println("Hiển thị danh sách");
                    List<DanhBa> list = repository.getAll();
                    display(list);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    danhBa = inputInfor();
                    repository.add(danhBa);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    System.out.println("Cập nhật");
                    update();
                    break;
                case 4:
                    System.out.println("Xóa");
                    delete();
                    break;
                case 5:
                    System.out.println("Tìm kiếm danh bạ");
                    findByPhone();
                    break;
                case 6:
                    System.out.println("Đọc từ file");
                    readFile();
                    break;
                case 7:
                    writeFile();
                    break;
                case 8:
                    return;
            }
        }
    }

    public static void readFile() {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();
        System.out.println("Đọc từ file sẽ cập nhật toàn bộ danh bạ. Nhấn y nếu bạn đồng ý và phím bất kỳ để hủy ");
        String input = scanner.nextLine();
        if (!input.equals("y")){
            System.out.println("Bạn đã hủy lệnh đọc từ file");
        } else {
            repository.readFile();
            System.out.println("Đọc file thành công");
        }
    }

    public static void writeFile() {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();
        System.out.println("Ghi từ file sẽ cập nhật toàn bộ danh bạ. Nhấn y nếu bạn đồng ý và phím bất kỳ để hủy ");
        String input = scanner.nextLine();
        if (!input.equals("y")){
            System.out.println("Bạn đã hủy lệnh ghi từ file");
        } else {
            repository.writeFile(inputInfor());
            System.out.println("ghi file thành công");
        }
    }

    public static void findByPhone() {
        Repository repository = new Repository();
        System.out.print("Nhập số điện thoại muốn tìm kiếm trong danh bạ: ");
        String phone = inputPhoneNumber();
        if (isExist(phone)){
            System.out.println(repository.findByPhoneNumber(phone));
        } else {
            System.out.println("Không tìm thấy danh bạ với số điện thoại trên");
        }
    }

    public static boolean isExist(String phone) {
        Repository repository = new Repository();
        return repository.findByPhoneNumber(phone) != null;
    }

    public static void delete() {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại muốn xóa: ");
        String phone = inputPhoneNumber();
        if (isExist(phone)){
            System.out.println(repository.findByPhoneNumber(phone));
            System.out.println("Bạn có chắc chắn muốn xóa. Nhấn y để xác nhận và nút bất kì để hủy");
            String input = scanner.nextLine();
            if (input.equals("y")){
                repository.deleteByNumberPhone(phone);
                System.out.println("Đã xóa thành công");
            }else {
                System.out.println("Bạn đã không xóa");
            }
        } else {
            System.out.println("Không tìm được danh bạ với số điện thoại");
        }
    }

    private static int inputChoice(){
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Nhập sai lựa chọn. Vui lòng nhập lại: ");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return 0;
    }

    public static void display(List<DanhBa> list){
        for (DanhBa d: list){
            System.out.println(d);
        }
    }

    public static DanhBa inputInfor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String phone = inputPhoneNumber();

        System.out.print("Nhập nhóm của danh bạ: ");
        String group = scanner.nextLine();

        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        while (!(email.matches("^[A-Za-z]{1,}@gmail.com$"))){
            System.out.println("Bạn đã nhập sai định dạng email. Vui lòng chỉ nhập chữ cái và @gmail.com ");
            System.out.print("Nhập lại (vd: chi@gmail.com): ");
            email = scanner.nextLine();
        }
        return new DanhBa(phone,group,name,gender,address,dateOfBirth,email);
    }

    public static String inputPhoneNumber() {
        Scanner scanner = new Scanner(System.in) ;
        String phone = scanner.nextLine() ;
        while (!(phone.matches("^0[1-9][0-9]{8}$"))){
            System.out.println("Bạn đã nhập sai định dạng số điện thoại, số đầu tiên phải là số 0 và số thứ 2 khác 0 ");
            System.out.print("Vui lòng nhập lại (Vd: 0912345678): ");
            phone = scanner.nextLine();
        }
        return phone;
    }

    public static void update(){
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository();
        System.out.print("Mời bạn nhập số điện thoại: ");
        String phone = inputPhoneNumber();
        if (isExist(phone)){
            System.out.print("Nhập nhóm của danh bạ: ");
            String group = scanner.nextLine();

            System.out.print("Nhập họ và tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập giới tính: ");
            String gender = scanner.nextLine();

            System.out.print("Nhập địa chỉ: ");
            String address = scanner.nextLine();

            System.out.print("Nhập ngày sinh: ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("Nhập email: ");
            String email = scanner.nextLine();
            while (!(email.matches("^[A-Za-z]{1,}@gmail.com$"))){
                System.out.println("Bạn đã nhập sai định dạng email. Vui lòng chỉ nhập chữ cái và @gmail.com ");
                System.out.print("Nhập lại (vd: chi@gmail.com): ");
                email = scanner.nextLine();
            }
            DanhBa d = new DanhBa(phone,group,name,gender,address,dateOfBirth,email);
            repository.update(d);
        } else {
            System.out.println("Không tìm thấy danh bạ với số điện thoại trên");
        }


    }
}
