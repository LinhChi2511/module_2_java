package Casestudy.MVC.repository;

import Casestudy.MVC.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static List<Student> students = new ArrayList<>();

    public List<Student> getAll() {
        File file = new File("module_2/src/Casestudy/MVC/data/Student.csv");
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
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return students;
    }

    public void add(Student s) {
        students.add(s);
        File file = new File("module_2/src/Casestudy/MVC/data/Student.csv");
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(s.getId() +","+ s.getName() +","+ s.getAddress() +","+ s.getPoint() +","+ s.getClassName());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } catch (Exception e){
            System.out.println("Lỗi");
        }
    }


}
