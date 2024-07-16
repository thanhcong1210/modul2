package bai_ly_thuyet;

import java.time.LocalDate;

public class Teacher extends Person{
    private String level;
    public Teacher(String name, LocalDate birthday, String email, String phoneNumber, String level) {
        super(name, birthday, email, phoneNumber);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                '}';
    }
}
