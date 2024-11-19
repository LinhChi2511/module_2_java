package Casestudy.MVC.service;

import Casestudy.MVC.entity.Student;

import java.util.List;

public interface IService<T>{
    List<T> getAll();
    void add(T t);
    void deleteById(int id);
    T findById(int id);
    void update(T t);
}
