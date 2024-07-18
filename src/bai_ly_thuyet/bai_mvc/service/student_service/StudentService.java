package bai_ly_thuyet.bai_mvc.service.student_service;

import bai_ly_thuyet.bai_mvc.model.Student;
import bai_ly_thuyet.bai_mvc.repository.student_repo.IStudentRepository;
import bai_ly_thuyet.bai_mvc.repository.student_repo.StudentRepository;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] findALL() {
        return new Student[0];
    }

    @Override
    public bai_ly_thuyet.Student[] findAll() {
        return new bai_ly_thuyet.Student[0];
    }
}

