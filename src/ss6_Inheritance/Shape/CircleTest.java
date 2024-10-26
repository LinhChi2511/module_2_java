package ss6_Inheritance.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(4.5, "pink", true);
        System.out.println(circle);
    }
}
