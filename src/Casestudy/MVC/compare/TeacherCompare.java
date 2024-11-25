package Casestudy.MVC.compare;

import Casestudy.MVC.entity.Teacher;

import java.util.Comparator;

public class TeacherCompare implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.getId()>o2.getId()){
            return 1;
        } else if (o1.getId()<o2.getId()){
            return -1;
        }
        return 0;
    }
}
