package Casestudy.MVC.service.impl;

import Casestudy.MVC.entity.Student;
import Casestudy.MVC.repository.StudentRepository;
import Casestudy.MVC.service.IStudentService;
import java.util.List;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();


    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();
        return students;
    }

    @Override
    public void add(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Student findById(int id) {
        List<Student> students = studentRepository.getAll();
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
