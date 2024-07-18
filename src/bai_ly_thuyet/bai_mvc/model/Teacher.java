package bai_ly_thuyet.bai_mvc.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private String level;

    public Teacher(String name, LocalDate birthDate, String email, String phoneNumber, String level) {
        super(name, birthDate, email, phoneNumber);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void teach(String subject) {
        System.out.println("Dạy môn " + subject);
    }

    @Override
    public void say() {
        System.out.println("Chào các bạn");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                '}' + super.toString();
    }
}
