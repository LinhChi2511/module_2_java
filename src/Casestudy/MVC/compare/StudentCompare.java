package Casestudy.MVC.compare;

import Casestudy.MVC.entity.Student;

import java.util.Comparator;

public class StudentCompare  implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId() > o2.getId()){
            return 1;
        } else if (o1.getId() < o2.getId()){
            return -1;
        }
        return 0;
    }
}
