package bai_ly_thuyet.quan_ly_code_gym.repository;

import bai_ly_thuyet.quan_ly_code_gym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void addStudent(Student student);
    void updateStudent(int id, Student updatedStudent);
    Student findStudentById(int id);
    boolean deleteStudent(int id);
}
