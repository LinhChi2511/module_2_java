package Casestudy.MVC.entity;

public class Teacher extends Person{
    private String email;
    private String className;
    private int experience;

    public Teacher(){}
    public Teacher(int id, String name, String address, String email, String className, int experience) {
        super(id, name, address);
        this.email = email;
        this.className = className;
        this.experience = experience;
    }

    public String getEmail() { return email; }
    public void setEmail(String age) { this.email = email; }
    public String getClassName() { return className; }
    public void setClassName(int experience) { this.className = className; }
    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }

    @Override
    public String toString() {
        return super.toString() + "; Teacher: " + "email= " + email + ", className= " + className + ", experience= " + experience +" years";
    }
}
