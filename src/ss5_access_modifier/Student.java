package ss5_access_modifier;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

//    constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // static method to change the value of static variable
    static void change(){
        college = "CODEGYM";
    }

    // method to display values
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        //calling change method

        Student s1 = new Student(1, "Bob");
        Student s2 = new Student(2, "Alice");
        Student s3 = new Student(3, "Min");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }

}
