package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int j=0; j<arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[arr.length-j-1];
            arr[arr.length-j-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
