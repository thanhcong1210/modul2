package bai_ly_thuyet.quan_ly_code_gym.service;

import bai_ly_thuyet.quan_ly_code_gym.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void addStudent(Student student);
    void updateStudent(int id,Student updateStudent);
    Student findStudentById(int id);
    boolean deleteStudent(int id);
}
