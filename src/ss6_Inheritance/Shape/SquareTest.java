package ss6_Inheritance.Shape;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(1.5);
        System.out.println(square);

        square = new Square(2.3, "yellow", true);
        System.out.println(square);
    }

}
