package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{2,3,4},{3,4,5}};
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);


        int[][] array;
        array = newAraray();

        System.out.println(Arrays.deepToString(array));
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j){
                    sum2 += array[i][j];
                }
            }
        }
        System.out.println("Total of diagonal is "+sum2);
    }
    public static int[][] newAraray() {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("element " + i +" "+j + " ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
