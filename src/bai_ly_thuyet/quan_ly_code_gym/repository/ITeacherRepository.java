package bai_ly_thuyet.quan_ly_code_gym.repository;

import bai_ly_thuyet.quan_ly_code_gym.model.Teacher;

import java.util.ArrayList;

public interface ITeacherRepository {
    ArrayList<Teacher> findAll();
    void addTeacher(Teacher teacher);
    void updateTeacher(int id, Teacher updatedTeacher);
    Teacher findTeacherById(int id);
    boolean deleteTeacher(int id);
}
