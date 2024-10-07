package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static int[] newArray () {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size of array");
            size = sc.nextInt();
        } while (size <= 0);
        int[] arr = new int[size];
        for (int i =0; i<size; i++) {
            System.out.println("Enter element");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array1 = newArray();
        int[] array2 = newArray();
        int[] array3 = new int[array1.length + array2.length];

        for (int i =0; i<array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j<array2.length; j++) {
            array3[array1.length+j] = array2[j];
        }
        System.out.println(Arrays.toString(array3));
    }
}