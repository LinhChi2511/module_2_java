package ss2_loop;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money, interestRate;
        int month;

        System.out.print("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.print("Enter month: ");
        month = scanner.nextInt();
        System.out.print("Enter annual interest rate in percentage:");
        interestRate = scanner.nextDouble();

        double total = 0;
        for (int i = 1; i <= month; i++) {
            total += money * (interestRate/100)/12 * month;
        }
        System.out.print("total of interest: " + total);
    }
}
