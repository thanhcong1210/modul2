package bai_ly_thuyet.quan_ly_code_gym.repository;

import bai_ly_thuyet.quan_ly_code_gym.model.Student;
import bai_ly_thuyet.quan_ly_code_gym.util.ReadAnhWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static final String STUDENT_FILE = "src/bai_ly_thuyet/quan_ly_code_gym/data/student.csv";
    public static List<Student> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public List<Student> findAll() {
        List<String> stringList = ReadAnhWrite.readFileCSVToListString(STUDENT_FILE);
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(STUDENT_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] elements = line.split(",");
                if (true) {
                    int id = Integer.parseInt(elements[0]);
                    String name = elements[1];
                    LocalDate birthDate = LocalDate.parse(elements[2]);
                    String email = elements[3];
                    String phoneNumber = elements[4];
                    String className = elements[5];
                    Student student = new Student(id, name, birthDate, email, phoneNumber, className);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file", e);
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        list.add(student);
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        ReadAnhWrite.writeStringListToCSV(STUDENT_FILE, stringList, true);
    }

    @Override
    public void updateStudent(int id, Student updatedStudent) {
        List<String> stringList = ReadAnhWrite.readFileCSVToListString(STUDENT_FILE);
        List<String> updates = new ArrayList<>();
        for (String string : stringList) {
            String[] elements = string.split(",");
            if (elements.length == 5) {
                int studentId = Integer.parseInt(elements[0].trim());
                if (studentId == id) {
                    updates.add(updatedStudent.getInfoToCSV());
                } else {
                    updates.add(string);
                }
            }
        }
        ReadAnhWrite.writeStringListToCSV(STUDENT_FILE, updates, false);
    }

    @Override
    public Student findStudentById(int id) {
        List<Student> students = new ArrayList<>();
        for (Student student : findAll()) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean deleteStudent(int id) {
        List<Student> students = findAll();
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                List<String> stringList = new ArrayList<>();
                for (Student student1 : students) {
                    stringList.add(student1.getInfoToCSV());
                }
                ReadAnhWrite.writeStringListToCSV(STUDENT_FILE, stringList, false);
                return true;
            }
        }
        return false;
    }
}
