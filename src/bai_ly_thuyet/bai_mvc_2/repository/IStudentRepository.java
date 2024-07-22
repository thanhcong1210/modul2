package bai_ly_thuyet.bai_mvc_2.repository;

import bai_ly_thuyet.bai_mvc_2.model.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> findAll();
    void addStudent(Student student);
    void updateStudent(String id, Student updatedStudent);
    Student findStudentById(String id);
    boolean deleteStudent(String id);
}
