package ss1_introduce_java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in USD");
        float usd = sc.nextFloat();
        if (usd <= 0){
            System.out.println("Invalid input");
        } else {
            float vnd = usd * 23000;
            System.out.println(usd + " usd = " + vnd + " vnd");
        }
    }
}
