package ss8_cleancode_MVC.controller;

import ss8_cleancode_MVC.entity.Student;
import ss8_cleancode_MVC.service.IStudentService;
import ss8_cleancode_MVC.service.impl.StudentService;

public class StudentController {
    private static IStudentService studentService = new StudentService();

    public Student[] getAll() {
        Student[] students = studentService.getAll();
        return students;
    }
}
