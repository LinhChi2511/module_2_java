package ss8_cleancode_MVC.service.impl;

import ss8_cleancode_MVC.entity.Student;
import ss8_cleancode_MVC.repository.StudentRepository;
import ss8_cleancode_MVC.service.IStudentService;

public class StudentService implements IStudentService {
    private static StudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] getAll() {
        Student[] students = studentRepository.getAll();
        return students;
    }
}
