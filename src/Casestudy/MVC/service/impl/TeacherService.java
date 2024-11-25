package Casestudy.MVC.service.impl;

import Casestudy.MVC.compare.TeacherCompare;
import Casestudy.MVC.entity.Teacher;
import Casestudy.MVC.repository.TeacherRepository;
import Casestudy.MVC.service.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public List<Teacher> getAll() {
        TeacherCompare teacherCompare = new TeacherCompare();
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(teacherCompare);
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
        teacherRepository.update(teacher);
    }

    @Override
    public Teacher findByName(String name) {
        List<Teacher> teachers = teacherRepository.getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

}
