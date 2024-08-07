package bai_ly_thuyet.quan_ly_code_gym.service;

import bai_ly_thuyet.quan_ly_code_gym.model.Teacher;
import bai_ly_thuyet.quan_ly_code_gym.repository.ITeacherRepository;
import bai_ly_thuyet.quan_ly_code_gym.repository.TeacherRepository;

import java.util.ArrayList;

public class TeacherService implements ITeacherService{
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
    public void updateTeacher(int id, Teacher updatedTeacher) {
        teacherRepo.updateTeacher(id, updatedTeacher);
    }

    @Override
    public Teacher findTeacherById(int id) {
        return teacherRepo.findTeacherById(id);
    }

    @Override
    public boolean deleteTeacher(int id) {
        teacherRepo.deleteTeacher(id);
        return true;
    }
}
