package ss6_Inheritance.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
//        kế thừa lại 2 thuộc tính từ Shape
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() { return Math.PI * radius * radius; }
//    tính diện tích
    public double getPerimeter() { return 2 * Math.PI * radius; }
//    tính chu vi

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", which is a subclass of = "
                + super.toString();
    }

}
