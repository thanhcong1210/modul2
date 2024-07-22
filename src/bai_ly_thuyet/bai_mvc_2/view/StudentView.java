package bai_ly_thuyet.bai_mvc_2.view;

import bai_ly_thuyet.bai_mvc_2.controller.StudentController;
import bai_ly_thuyet.bai_mvc_2.model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentView {
    private StudentController studentController;
    private Scanner sc = new Scanner(System.in);

    public StudentView(StudentController studentController) {
        this.studentController = studentController;
    }

    public void display() {
        studentController.getAllStudents().forEach(System.out::println);
    }

    public void editStudent() {
        System.out.print("Nhập ID của học viên cần chỉnh sửa: ");
        String id = sc.nextLine();

        Student existingStudent = studentController.getStudentById(id);
        if (existingStudent == null) {
            System.out.println("Không tìm thấy học viên có ID là: " + id);
            return;
        }

        System.out.println("Thông tin học viên cần chỉnh sửa:");
        System.out.println(existingStudent);

        int choice;
        do {
            System.out.println("Chọn thông tin cần chỉnh sửa: \n" +
                    "1. Tên. \n" +
                    "2. Ngày sinh. \n" +
                    "3. Email. \n" +
                    "4. Số điện thoại. \n" +
                    "5. Lớp. \n" +
                    "6. Hoàn thành. \n"
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Tên mới:");
                    String newName = sc.nextLine();
                    existingStudent.setName(newName);
                    break;
                case 2:
                    System.out.println("Ngày sinh mới:");
                    LocalDate newBirthday = LocalDate.parse(sc.nextLine());
                    existingStudent.setBirthDate(newBirthday);
                    break;
                case 3:
                    System.out.println("Email mới:");
                    String newEmail = sc.nextLine();
                    existingStudent.setEmail(newEmail);
                    break;
                case 4:
                    System.out.println("SĐT mới:");
                    String newPhoneNumber = sc.nextLine();
                    existingStudent.setPhoneNumber(newPhoneNumber);
                    break;
                case 5:
                    System.out.println("Lớp mới:");
                    String newClassName = sc.nextLine();
                    existingStudent.setClassName(newClassName);
                    break;
            }
        } while (choice != 6);
        studentController.updateStudent(id, existingStudent);
    }

    public void addStudent() {
        System.out.println("Nhập id");
        String id = sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập tên lớp: ");
        String className = sc.nextLine();

        Student student = new Student(id, name, birthday, email, phoneNumber, className);
        studentController.addStudent(student);
    }

    public void deleteStudent() {
        System.out.print("Nhập ID của học viên cần xóa: ");
        String id = sc.nextLine();

        Student existingStudent = studentController.getStudentById(id);
        if (existingStudent == null) {
            System.out.println("Không tìm thấy học viên có ID là: " + id);
            return;
        }
        System.out.println("Thông tin học viên cần xóa:");
        System.out.println(existingStudent);
        if (studentController.deleteStudent(id)) {
            System.out.println("Xóa thành công");
        }
    }

    public void displayStudentFunctional() {
        int choice;
        do {
            System.out.println("Quản lý học viên: \n" +
                    "1. Hiển thị danh sách học viên. \n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Chỉnh sửa thông tin học viên. \n" +
                    "4. Xóa học viên. \n" +
                    "5. Quay lại menu chính. \n" +
                    "Xin chọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}