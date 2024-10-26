package ss6_Inheritance.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("red",false);
        System.out.println(shape2);
    }
}
