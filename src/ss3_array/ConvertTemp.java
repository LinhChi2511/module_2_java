package ss3_array;

import java.util.Scanner;

public class ConvertTemp {
    public static double cToF(double celsius) {
        return (9*celsius/5 +32);
    }
    public static double fToC(double f) {
        return (5*f/9 -32);
    }
    public static void main(String[] args) {
        double doC;
        double doF;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        } while (choice <0 || choice > 2);
        switch (choice) {
            case 1:
                System.out.println("Enter Fahrenheit: ");
                doF = sc.nextDouble();
                System.out.println(doF + " Fahrenheit = " + fToC(doF) + " Celsius");
                break;
            case 2:
                System.out.println("Enter Celsius: ");
                doC = sc.nextDouble();
                System.out.println(doC + " Celsius = " + cToF(doC) + " Fahrenheit");
                break;
            case 0:
                System.exit(0);
        }
    }
}
