package Casestudy.MVC.entity;

public class Teacher extends Person{
    private int age;
    private String className;

    public Teacher(){}
    public Teacher(int id, String name, String address, int age, String className) {
        super(id, name, address);
        this.age = age;
        this.className = className;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getClassName() { return className; }
    public void setClassName(int experience) { this.className = className; }

    @Override
    public String toString() {
        return super.toString() + "; Teacher: " + "age= " + age + ", className= " + className;
    }
}
