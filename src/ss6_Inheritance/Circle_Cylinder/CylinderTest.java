package ss6_Inheritance.Circle_Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3,1);
        System.out.println(cylinder);

        cylinder = new Cylinder(3,5,"black");
        System.out.println(cylinder);
    }
}
