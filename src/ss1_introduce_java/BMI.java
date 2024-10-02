package ss1_introduce_java;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, bmi;
        System.out.print("Enter the height in meters: ");
        height = scanner.nextFloat();
        System.out.print("Enter the weight in kilograms: ");
        weight = scanner.nextFloat();
        bmi = weight / Math.pow(height,2);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18){
            System.out.println("Underweight");
        } else if (bmi < 25){
            System.out.println("Normal");
        } else if (bmi < 30){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
