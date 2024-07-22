package bai_ly_thuyet.bai_mvc_2.service;

import bai_ly_thuyet.bai_mvc_2.model.Teacher;
import bai_ly_thuyet.bai_mvc_2.repository.ITeacherRepository;
import bai_ly_thuyet.bai_mvc_2.repository.TeacherRepository;

import java.util.ArrayList;

public class TeacherService implements ITeacherService {
    private ITeacherRepository teacherRepo = new TeacherRepository();
    @Override
    public ArrayList<Teacher> findAll() {
        return teacherRepo.findAll();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepo.addTeacher(teacher);
    }

    @Override
    public void updateTeacher(String id, Teacher updatedTeacher) {
        teacherRepo.updateTeacher(id, updatedTeacher);
    }

    @Override
    public Teacher findTeacherById(String id) {
        return teacherRepo.findTeacherById(id);
    }

    @Override
    public boolean deleteTeacher(String id) {
        teacherRepo.deleteTeacher(id);
        return true;
    }
}
