package ss6_Inheritance.Point2D_3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){}

    public Point3D(float x,float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() { return z;}
    public void setZ(float z) { this.z = z;}

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point 3D has x= "
                + getX()
                + " y= "
                + getY()
                + " z= "
                + getZ();
    }

    public static void main(String[] args) {
        Point3D p = new Point3D(10,20,30);
        System.out.println(p);
    }
}
