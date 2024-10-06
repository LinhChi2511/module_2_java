package ss2_loop;

public class Print_Rectangle_Triangle {
    public static void main(String[] args) {
        System.out.println("This is a triangle");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("This is a rectangle");
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i + j > 3) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i + j > 3) {
                    System.out.print("");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i + j <= 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("Print isosceles triangle");
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i+1); k++) {
                System.out.print("*");
            }
               System.out.println();
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <=7-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

