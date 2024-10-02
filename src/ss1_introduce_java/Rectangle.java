package ss1_introduce_java;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width, height, area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextFloat();
        System.out.print("Enter the height of the rectangle: ");
        height = scanner.nextFloat();

        if (width<=0 || height<=0) {
            System.out.println("Invalid input");
        } else {
            area = width*height;
            System.out.println("The area of the rectangle is "+area);
        }
    }
}
