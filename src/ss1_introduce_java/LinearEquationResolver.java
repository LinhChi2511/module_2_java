package ss1_introduce_java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c' ");
        float a, b, c, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextFloat();
        System.out.print("b: ");
        b = sc.nextFloat();
        System.out.print("c: ");
        c = sc.nextFloat();

        if (a!=0){
            x = (c-b)/a;
            System.out.println("x = "+x);
        } else if (b == c){
            System.out.print("The solution is all x");
        } else {
            System.out.print("No solution");
        }
    }
}
