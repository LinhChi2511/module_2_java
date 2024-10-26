package ss6_Inheritance.Circle_Cylinder;

public class Circle {
    private double radius = 2.0;
    private String color = "blue";

    public Circle(){}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){ return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String getColor(){ return color; }
    public void setColor(String color) { this.color = color; }

    public double getArea(){ return Math.PI * radius * radius; }

    @Override
    public String toString() {
        return "Circle with radius = "
                + getRadius()
                + ", color = "
                + getColor()
                + ", area = " + getArea();
    }
}
