package bai_ly_thuyet.bai_mvc.model;

import java.time.LocalDate;

abstract class Person {
    private String name;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;

    public Person(String name, LocalDate birthDate, String email, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void say();

    @Override
    public String toString() {
        return
                ", name='" + name + '\'' +
                        ", birthDate=" + birthDate +
                        ", email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        '}';
    }
}
