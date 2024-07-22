package bai_ly_thuyet.bai_mvc_2.service;

import bai_ly_thuyet.bai_mvc_2.model.Student;

import java.util.ArrayList;

public interface IStudentService {
    ArrayList<Student> findAll();
    void addStudent(Student student);
    void updateStudent(String id,Student updateStudent);
    Student findStudentById(String id);
    boolean deleteStudent(String id);
}
