package ss8_cleancode_MVC.repository;

import ss8_cleancode_MVC.entity.Student;

public class StudentRepository {
    private static Student[] students = new Student[5];

    static {
        students[0] = new Student(1,"Nguyen","Da Nang",10, "C0724");
        students[1] = new Student(2,"Nguyen","Da Nang",10, "C0724");
        students[2] = new Student(3,"Nguyen","Da Nang",10, "C0724");
        students[3] = new Student(4,"Nguyen","Da Nang",10, "C0724");
        students[4] = new Student(5,"Nguyen","Da Nang",10, "C0724");
    }

    public Student[] getAll() {
        return students;
    }
}
