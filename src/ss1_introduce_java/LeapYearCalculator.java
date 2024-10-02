package ss1_introduce_java;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year <= 0){
            System.out.println("Invalid input");
        } else if (year % 400 == 0){
            System.out.println("Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap Year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
