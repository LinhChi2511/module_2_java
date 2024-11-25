package Casestudy.MVC.controller;

import Casestudy.MVC.entity.Teacher;
import Casestudy.MVC.service.impl.TeacherService;

import java.util.List;

public class TeacherController {
    TeacherService teacherService = new TeacherService();

    public List<Teacher> getAll(){
        List<Teacher>  teachers = teacherService.getAll();
        return teachers;
    }

    public void add(Teacher teacher){
        teacherService.add(teacher);
    }

    public boolean isExist(int id) {
        if (teacherService.findById(id) != null) {
            return true;
        }
        return false;
    }

    public Teacher findById(int id) {
        return teacherService.findById(id);
    }

    public void delete(int id) {
        teacherService.deleteById(id);
    }

    public Teacher findByName(String name) {
        return teacherService.findByName(name);
    }

    public void update(Teacher teacher){
        teacherService.update(teacher);
    }

}
