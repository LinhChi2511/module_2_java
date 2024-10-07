package ss3_array;

import java.util.Scanner;

public class Student {
    public static int[] newArr(){
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 30 ){
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30 || size <= 0);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a mark for student " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = newArr();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.println("The number of students pass the exam is " + count);
    }
}