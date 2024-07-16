package bai_tap_bo_sung.luyen_tap_trien_khai_class.model;

public class Doctor {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phoneNumber;
    private String position;

    public Doctor(){}

    public Doctor(String name, int age, String address, String email, String phoneNumber, String position) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayInfor() {
        System.out.println("Thông tin bác sĩ:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Vị trí làm việc: " + position);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
