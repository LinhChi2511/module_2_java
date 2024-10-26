package ss6_Inheritance.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public Cylinder(double height, double radius) {
        this.height = height;
        setRadius(radius);
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getArea(double height, double radius) {
        return (2*Math.PI*radius*height + 2*Math.PI*radius*radius);
    }
    @Override
    public String toString() {
        return "Cylinder width"
                + " height = "
                + getHeight()
                + " and radius = "
                + getRadius()
                + " and color = "
                + getColor()
                + " and Area = "
                + getArea();
    }
}
