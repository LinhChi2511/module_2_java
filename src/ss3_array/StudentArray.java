package ss3_array;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Linh", "Minh","An","Nhi"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of " + name + " is " + i +" in array");
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            System.out.println("Not found " +name+ " in array");
        }
    }
}
