package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size of array: ");
            size = sc.nextInt();
        } while (size < 0);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to delete: ");
        int x = sc.nextInt();
        boolean isExist = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                isExist = true;
                index = i;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Position of " + x + " in array is " + index);
        } else {
            System.out.println(x + "does not exist in array");
        }

        int[] temp = new int[size-1];
        for (int i = 0; i < index; i++) {
            temp[i] = arr[i];
        }
        for (;index < arr.length-1; index++){
            temp[index] = arr[index+1];
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }
}