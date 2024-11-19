package Casestudy.MVC.repository;

import Casestudy.MVC.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public static final String SRC_Student = "module_2/src/Casestudy/MVC/data/Student.csv";

    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        File file = new File(SRC_Student);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]), temp[4]);
                students.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi doc file");
        }
        return students;
    }

    public void add(Student s) {
        File file = new File(SRC_Student);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(s.getId() + "," + s.getName() + "," + s.getAddress() + "," + s.getPoint() + "," + s.getClassName());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
    }


    public void deleteById(int id) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                break;
            }
        }
        saveList(students);
    }

    public Student findById(int id) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static void saveList(List<Student> students){
        File file = new File(SRC_Student);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s: students){
                bufferedWriter.write(s.getId() + "," + s.getName() + "," + s.getAddress() + "," + s.getPoint() + "," + s.getClassName());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
    }

    public void update(Student student){
        List<Student> students = getAll();
        for (int i=0; i<students.size(); i++){
            if (students.get(i).getId() == student.getId()){
                students.set(i, student);
                return;
            }
        }
        saveList(students);

    }


}
