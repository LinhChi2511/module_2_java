package ss5_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){return radius;}

    private double getArea(){return Math.PI * radius * radius;}

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Circle circle2 = new Circle(2.4);
        System.out.println(circle2.getArea());
    }

}
