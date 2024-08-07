package bai_ly_thuyet.quan_ly_code_gym.service;

import bai_ly_thuyet.quan_ly_code_gym.model.Student;
import bai_ly_thuyet.quan_ly_code_gym.repository.IStudentRepository;
import bai_ly_thuyet.quan_ly_code_gym.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    @Override
    public void updateStudent(int id, Student updateStudent) {
        studentRepository.updateStudent(id, updateStudent);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public boolean deleteStudent(int id) {
        studentRepository.deleteStudent(id);
        return true;
    }
}
