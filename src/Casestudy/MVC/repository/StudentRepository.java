package Casestudy.MVC.repository;

import Casestudy.MVC.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public static final String SRC_Student = "src/Casestudy/MVC/data/student.dat";
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        File file = new File(SRC_Student);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file");
        } catch (ClassNotFoundException e){
            System.out.println("Lỗi không tìm thấy class");
        }catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return students;
    }

    public void save(Student s) {
        List<Student> students = getAll();
        students.add(s);
        writeBinary(students);
    }

    public void writeBinary(List<Student> students) {
        File file = new File(SRC_Student);
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } catch (Exception e){
            System.out.println("Lỗi khác");
        }
    }

}
