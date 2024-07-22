package bai_ly_thuyet.bai_mvc_2.controller;

import bai_ly_thuyet.bai_mvc_2.model.Teacher;
import bai_ly_thuyet.bai_mvc_2.service.ITeacherService;
import bai_ly_thuyet.bai_mvc_2.service.TeacherService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();

    public ArrayList<Teacher> getAllTeachers() {
        return teacherService.findAll();
    }

    public Teacher getTeacherById(String id) {
        return teacherService.findTeacherById(id);
    }

    public void updateTeacher(String id, Teacher teacher) {
        teacherService.updateTeacher(id, teacher);
    }

    public void addTeacher(Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    public boolean deleteTeacher(String id) {
        return teacherService.deleteTeacher(id);
    }
}
