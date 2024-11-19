package Casestudy.MVC.repository;

import Casestudy.MVC.entity.Student;
import Casestudy.MVC.entity.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    public static final String SRC = "module_2/src/Casestudy/MVC/data/Teacher.csv";

    public List<Teacher> getAll(){
        List<Teacher> teachers = new ArrayList<>();
        File file = new File(SRC);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Teacher teacher;
            while ((line = bufferedReader.readLine())!= null){
                String[] data = line.split(",");
                teacher = new Teacher(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], Integer.parseInt(data[5])) ;
                teachers.add(teacher);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (Exception e) {
            System.out.println("Lỗi khác");
        }
        return teachers;
    }

    public void add(Teacher t){
        File file = new File(SRC);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(t.getId()+ "," +t.getName()+ "," +t.getAddress()+ "," +t.getEmail()+ "," +t.getClassName() +","+ t.getExperience());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public Teacher findById(int id) {
        List<Teacher> teachers = getAll();
        for (Teacher teacher: teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    public static void saveList(List<Teacher> teachers){
        File file = new File(SRC);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher t: teachers) {
                bufferedWriter.write(t.getId()+ "," +t.getName()+ "," +t.getAddress()+ "," +t.getEmail()+ "," +t.getClassName()+","+t.getExperience());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
    }

    public void deleteById(int id) {
        List<Teacher> teachers = getAll();
        for (Teacher t: teachers) {
            if (t.getId() == id) {
                teachers.remove(t);
                break;
            }
        }
        saveList(teachers);
    }

}
