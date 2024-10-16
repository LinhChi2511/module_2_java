package ss4_OOP;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(double a, double b, double c) {
        return ((b*b)-4*a*c);
    }
    public double getRoot1(double a, double b, double c) {
        return (-b +Math.sqrt(b*b -4*a*c))/(2*a);
    }
    public double getRoot2(double a, double b, double c) {
        return (-b - Math.sqrt(b*b -4*a*c))/(2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Solve: ax2 + bx + c = 0");
        System.out.print("Enter a,b,c ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDelta(a,b,c);
        if (delta < 0){
            System.out.println("The equation has no solution");
        } else if (delta == 0){
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1(a,b,c));
        } else {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1(a,b,c)+ " and " + quadraticEquation.getRoot2(a,b,c));
        }
    }
}
