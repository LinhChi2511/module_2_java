package ss3_array;

import java.util.Scanner;

public class MinArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
        } while (size <= 0);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i+1) + " element : ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min of array is " +min);
    }
}
