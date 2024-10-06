package ss2_loop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = scanner.nextInt();

        if (number < 2) {
            System.out.println( number + " is not prime number");
        } else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println( number + " is a prime number");
            } else {
                System.out.println( number + " is not a prime number");
            }
        }
    }
}
