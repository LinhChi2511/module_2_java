package Casestudy.MVC.service.impl;

import Casestudy.MVC.compare.StudentCompare;
import Casestudy.MVC.entity.Student;
import Casestudy.MVC.repository.StudentRepository;
import Casestudy.MVC.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();


    @Override
    public List<Student> getAll() {
        StudentCompare studentCompare = new StudentCompare();
        List<Student> students = studentRepository.getAll();
        students.sort(studentCompare);
        return students;
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void update(Student student) {
        studentRepository.update(student);
    }

    @Override
    public Student findByName(String name) {
        List<Student> students = studentRepository.getAll();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}
