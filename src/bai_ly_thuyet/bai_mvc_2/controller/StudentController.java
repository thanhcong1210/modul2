package bai_ly_thuyet.bai_mvc_2.controller;

import bai_ly_thuyet.bai_mvc_2.model.Student;
import bai_ly_thuyet.bai_mvc_2.service.IStudentService;
import bai_ly_thuyet.bai_mvc_2.service.StudentService;

import java.util.ArrayList;


public class StudentController {
    private IStudentService studentService = new StudentService();

    public ArrayList<Student> getAllStudents() {
        return studentService.findAll();
    }

    public Student getStudentById(String id) {
        return studentService.findStudentById(id);
    }

    public void updateStudent(String id, Student student) {
        studentService.updateStudent(id, student);
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public boolean deleteStudent(String id) {
        return studentService.deleteStudent(id);
    }
}
