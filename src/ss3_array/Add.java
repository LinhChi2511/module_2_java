package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
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
        System.out.print("Enter element to add: ");
        int x = sc.nextInt();
        System.out.print("Enter position of element: ");
        int index = sc.nextInt();
        if (index < 0 || index > arr.length){
            System.out.println("Cannot add element");
        } else {
            int[] temp = new int[size+1];
            for (int i = 0; i < index; i++) {
                temp[i] = arr[i];
            }
            temp[index] = x;
            for (int j = index+1; j < temp.length; j++) {
                temp[j] = arr[j-1];
            }
            arr = temp;
            System.out.print(Arrays.toString(arr));
        }
    }
}
