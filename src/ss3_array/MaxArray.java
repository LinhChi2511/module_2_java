package ss3_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("List : ");
        System.out.println(Arrays.toString(array));
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println("Max array is: " +max);
    }
}
