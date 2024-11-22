package Casestudy.thi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    public static final String SRC = "module_2/src/Casestudy/thi/data.csv";

    public List<DanhBa> getAll(){
        List<DanhBa> list = new ArrayList<>();
        File file = new File(SRC);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            DanhBa danhBa;
            while ((line = bufferedReader.readLine()) != null){
                String[] temp = line.split(",");
                danhBa = new DanhBa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                list.add(danhBa);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        return list;
    }

    public void add(DanhBa d){
        File file = new File(SRC);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(d.getPhoneNumber()+","+d.getGroup()+","+d.getName()+","+d.getGender()+","+d.getAddress()+","+d.getDateOfBirth()+","+d.getEmail());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
    }

    public void deleteByNumberPhone(String number) {
        List<DanhBa> list = getAll();
        for (DanhBa d : list) {
            if (d.getPhoneNumber().equals(number)) {
                list.remove(d);
                break;
            }
        }
        saveList(list);
    }

    public static void saveList(List<DanhBa> list) {
        File file = new File(SRC);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhBa d : list) {
                bufferedWriter.write(d.getPhoneNumber()+","+d.getGroup()+","+d.getName()+","+d.getGender()+","+d.getAddress()+","+d.getDateOfBirth()+","+d.getEmail());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
    }

    public DanhBa findByPhoneNumber(String number) {
        List<DanhBa> list = getAll();
        for (DanhBa d : list) {
            if (d.getPhoneNumber().equals(number)) {
                return d;
            }
        }
        return null;
    }

    public void update(DanhBa d){
        List<DanhBa> list = getAll();
        for (int i=0;i<list.size();i++){
            if (list.get(i).getPhoneNumber().equals(d.getPhoneNumber())){
                list.set(i,d);
                break;
            }
        }
        saveList(list);
    }

    public List<DanhBa> readFile(){
        List<DanhBa> list = new ArrayList<>();
        File file = new File("module_2/src/Casestudy/thi/data/contacts.csv");
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            DanhBa danhBa;
            while ((line = bufferedReader.readLine()) != null){
                String[] temp = line.split(",");
                danhBa = new DanhBa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                list.add(danhBa);
            }
            saveList(list);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        return list;
    }

    public void writeFile(DanhBa d){
        File file = new File("module_2/src/Casestudy/thi/data/contacts.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(d.getPhoneNumber()+","+d.getGroup()+","+d.getName()+","+d.getGender()+","+d.getAddress()+","+d.getDateOfBirth()+","+d.getEmail());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi ghi file");
        }
    }
}
