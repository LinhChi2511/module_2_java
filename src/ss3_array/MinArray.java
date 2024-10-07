package ss3_array;

import java.util.Scanner;

public class MinArray {
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size of array: ");
            size = sc.nextInt();
        } while (size < 0);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Min of array is " +minArray(arr));
    }
}
