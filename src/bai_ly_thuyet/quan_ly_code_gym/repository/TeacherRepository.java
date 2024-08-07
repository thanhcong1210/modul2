package bai_ly_thuyet.quan_ly_code_gym.repository;

import bai_ly_thuyet.quan_ly_code_gym.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;

public class TeacherRepository implements ITeacherRepository {
    private static ArrayList<Teacher> list;

    static {
        list = new ArrayList<>();
        Teacher t1 = new Teacher(1, "Tom", LocalDate.parse("2020-02-02"), "tomnguyen@gmail.com", "0908090809", "Giảng viên");
        Teacher t2 = new Teacher(2, "Công", LocalDate.parse("2001-02-02"), "congdang@gmail.com", "0908090809", "Giảng viên");
        list.add(t1);
        list.add(t2);

    }

    @Override
    public ArrayList<Teacher> findAll() {
        return list;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        list.add(teacher);
    }

    @Override
    public void updateTeacher(int id, Teacher updatedTeacher) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == updatedTeacher.getId()) {
                list.set(i, updatedTeacher);
                return;
            }
        }
    }

    @Override
    public Teacher findTeacherById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean deleteTeacher(int id) {
        list.remove(findTeacherById(id));
        return true;
    }
}
