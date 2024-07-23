package bai_ly_thuyet.bai_mvc_2.service;

import bai_ly_thuyet.bai_mvc_2.model.Teacher;

import java.util.ArrayList;

public interface ITeacherService  {
    ArrayList<Teacher> findAll();
    void addTeacher(Teacher teacher);
    void updateTeacher(String id, Teacher updatedTeacher);
    Teacher findTeacherById(String id);
    boolean deleteTeacher(String id);
}