package Casestudy.MVC.service.impl;

import Casestudy.MVC.entity.Teacher;
import Casestudy.MVC.repository.StudentRepository;
import Casestudy.MVC.repository.TeacherRepository;
import Casestudy.MVC.service.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public List<Teacher> getAll() {
        List<Teacher> teachers = teacherRepository.getAll();
        return teachers;
    }

    @Override
    public void add(Teacher teacher) {
        teacherRepository.add(teacher);
    }

    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher findById(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public void update(Teacher teacher) {

    }
}
