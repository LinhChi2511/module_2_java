package ss3_array;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[][]{{1,2,3},{2,3,4}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the column number to plus");
        int index = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][index];
        }
        System.out.println("The sum of the column numbers is " + sum);
    }
}
