package bai_ly_thuyet.quan_ly_code_gym.model;

import java.time.LocalDate;

public abstract class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(int id, String name, LocalDate dateOfBirth, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void say();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber
                ;
    }
}
