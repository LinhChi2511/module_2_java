package ss2_loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int count = 0, num = 2;
        boolean isPrime;
        while (count < number){
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num);
                count++ ;
            }
            num++;
        }
    }
}
