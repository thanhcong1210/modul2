package bai_ly_thuyet.bai_mvc.service.teacher_service;

import bai_ly_thuyet.Teacher;
import bai_ly_thuyet.bai_mvc.repository.teacher_repo.ITeacherRepository;
import bai_ly_thuyet.bai_mvc.repository.teacher_repo.TeacherRepository;

public class TeacherService implements ITeacherService {
    private ITeacherRepository teacherRepo = new TeacherRepository();

    @Override
    public Teacher[] findAll() {
        return new Teacher[0];
    }
}

