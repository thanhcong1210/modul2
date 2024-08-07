package bai_ly_thuyet.IO_text;

import bai_ly_thuyet.quan_ly_code_gym.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        Person person = new Person("công", 20);
//        try (FileOutputStream fileOut = new FileOutputStream("src/bai_ly_thuyet/IO_text/person.dat");
//             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//            out.writeObject(person);
//            System.out.println("Đối tượng đã được ghi vào file.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (FileInputStream fileIn = new FileInputStream("src/bai_ly_thuyet/IO_text/person.dat");
//             ObjectInputStream in = new ObjectInputStream(fileIn)) {
//            Person savedPerson = (Person) in.readObject();
//            System.out.println("Đối tượng đã được đọc từ file: " + savedPerson);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }


        public static List<Student> readDataFromFile (String path){
            List<Student> students = new ArrayList<>();
            try {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                students = (List<Student>) ois.readObject();
                fis.close();
                ois.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return students;
        }
    }

