package ss8_cleancode_MVC.entity;

public class Student extends Person{
    private double point;
    private String className;

    public Student() {}

    public Student(long code, String name, String address, double point, String className) {
        super(code, name, address);
        this.point = point;
        this.className = className;
    }

    public double getPoint() { return point; }

    public void setPoint(double point) { this.point = point; }

    public String getClassName() { return className; }

    public void setClassName(String className) { this.className = className; }

    public String toString(){
        return super.toString() + " Point: " + point + " Class: '" + className +"'";
    }
}
