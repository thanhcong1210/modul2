package bai_ly_thuyet.bai_mvc.model;

import java.time.LocalDate;

public class Student extends Person {
    private String className;

    public Student(String name, LocalDate birthDate, String email, String phoneNumber, String className) {
        super(name, birthDate, email, phoneNumber);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void learn(String subject) {
        System.out.println("Học môn " + subject);
    }

    @Override
    public void say() {
        System.out.println("Dear teacher .....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                '}' + super.toString();
    }
}
