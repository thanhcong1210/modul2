package bai_ly_thuyet.bai_mvc_2.service;

import bai_ly_thuyet.bai_mvc_2.model.Student;
import bai_ly_thuyet.bai_mvc_2.repository.IStudentRepository;
import bai_ly_thuyet.bai_mvc_2.repository.StudentRepository;

import java.util.ArrayList;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public ArrayList<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    @Override
    public void updateStudent(String id, Student updateStudent) {
        studentRepository.updateStudent(id, updateStudent);
    }

    @Override
    public Student findStudentById(String id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public boolean deleteStudent(String id) {
        studentRepository.deleteStudent(id);
        return true;
    }
}
