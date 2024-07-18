package bai_ly_thuyet.bai_mvc.repository.student_repo;

import bai_ly_thuyet.Student;
import java.time.LocalDate;

public class StudentRepository implements IStudentRepository{
    private static Student[] students;
    static {
        students = new Student[5];
        Student s1 = new Student("Thành Công", LocalDate.parse("2004-08-10"), "condl@gmail.com", "091212121212", "C05");
        Student s2 = new Student("Thành Kon", LocalDate.parse("2004-11-12"), "condl@gmail.com", "091212121212", "C05");
        students[0] = s1;
        students[1] = s2;
    }


    @Override
    public bai_ly_thuyet.bai_mvc.model.Student[] findALL() {
        return new bai_ly_thuyet.bai_mvc.model.Student[0];
    }
}

