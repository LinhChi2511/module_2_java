package Casestudy.MVC.controller;

import Casestudy.MVC.entity.Student;
import Casestudy.MVC.service.impl.StudentService;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentService();

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public void add(Student student) {
        studentService.add(student);

    }

    public boolean isExist(int id) {
        return studentService.findById(id) != null;
    }

    public Student findById(int id) {
        return studentService.findById(id);
    }

    public void deleteById(int id) {
        studentService.deleteById(id);
    }

    public void update(Student s) {
        studentService.update(s);
    }

    public Student findByName(String name) {
        return studentService.findByName(name);
    }
}
