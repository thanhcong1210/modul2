package bai_ly_thuyet.quan_ly_code_gym.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private String level;

    public Teacher() {
    }

    public Teacher(int id, String name, LocalDate dateOfBirth, String email, String phoneNumber, String level) {
        super(id, name, dateOfBirth, email, phoneNumber);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void say() {
        System.out.println("Chào các em");
    }

    public String teacherInfo() {
        return  getId() + "," + getName() + "," + super.getDateOfBirth() + "," + super.getEmail() + "," + super.getPhoneNumber();
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                teacherInfo()+
                '}';
    }
}