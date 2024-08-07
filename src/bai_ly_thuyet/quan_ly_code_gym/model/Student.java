package bai_ly_thuyet.quan_ly_code_gym.model;

import java.time.LocalDate;

public class Student extends Person {
   private String className;

    public Student() {
    }

    public Student(int id, String name, LocalDate dateOfBirth, String email, String phoneNumber, String className) {
        super(id, name, dateOfBirth, email, phoneNumber);
        this.className = className;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void say() {
        System.out.println("I am Student");
    }

    public String getInfoToCSV() {
        return  getId() + "," + getName() + "," + super.getDateOfBirth() + "," + super.getEmail() + "," + super.getPhoneNumber() + "," + getClassName();
    }

    @Override
    public String toString() {
        return super.toString() + "Class name" + getClassName();

    }
}
