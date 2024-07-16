package bai_ly_thuyet;

import java.time.LocalDate;

public class Student extends Person {
    private String className;
    public Student(String name, LocalDate birthday, String email, String phoneNumber, String className) {
        super(name, birthday, email, phoneNumber);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                '}';
    }
}
