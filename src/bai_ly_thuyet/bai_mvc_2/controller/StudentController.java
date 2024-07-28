package bai_ly_thuyet.bai_mvc_2.controller;

import bai_ly_thuyet.bai_mvc_2.model.Student;
import bai_ly_thuyet.bai_mvc_2.service.IStudentService;
import bai_ly_thuyet.bai_mvc_2.service.StudentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentController {
    private IStudentService studentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        ArrayList<Student> students = studentService.findAll();
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public void addStudent() {
        System.out.println("Nhập id :");
        String id = scanner.nextLine();
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh :");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập email :");
        String email = scanner.nextLine();
        System.out.println("Nhập số điện thoại :");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập tên lớp :");
        String className = scanner.nextLine();

        Student stuDent = new Student(id, name, date, email, phoneNumber, className);
        studentService.addStudent(stuDent);
        System.out.println("Thêm thành công!!!");
    }

    public void deleteStudent() {
        System.out.println("Nhập id của học viên cần xóa :");
        String id = scanner.nextLine();
        Student CurrentStudent = studentService.findStudentById(id);
        if (CurrentStudent == null) {
            System.out.println("Không tìm thấy học viên có id : " + id);
            return;
        }
        System.out.println("Thông tin giáo viên cần xóa : ");
        System.out.println(CurrentStudent);
        if (studentService.deleteStudent(id)) {
            System.out.println("Xóa thành công!!!");
        }
    }

    public void updateStudent() {
        System.out.println("Nhập id của học viên cần chỉnh sửa :");
        String id = scanner.nextLine();
        Student CurrentStudent = studentService.findStudentById(id);
        if (CurrentStudent == null) {
            System.out.println("Không tìm thấy học viên có id : " + id);
            return;
        }
        System.out.println("Thông tin học viên cần chỉnh sửa : ");
        System.out.println(CurrentStudent);

        int choice;
        do {
            System.out.println("Chọn thông tin cần chỉnh sửa: ");
            System.out.println("1. Tên ");
            System.out.println("2. Ngày sinh ");
            System.out.println("3. Email ");
            System.out.println("4. Số điện thoại ");
            System.out.println("5. Tên lớp ");
            System.out.println("6. Hoàn thành ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Tên mới:");
                    String answer = scanner.nextLine();
                    if (answer != null) {
                        CurrentStudent.setName(answer);
                    }
                    break;
                case 2:
                    System.out.println("Ngày sinh mới:");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    if (date != null) {
                        CurrentStudent.setBirthDate(date);
                    }
                    break;
                case 3:
                    System.out.println("Email mới:");
                    String email = scanner.nextLine();
                    if (email != null) {
                        CurrentStudent.setEmail(email);
                    }
                    break;
                case 4:
                    System.out.println("Số điện thoại mới:");
                    String newPhone = scanner.nextLine();
                    if (newPhone != null) {
                        CurrentStudent.setPhoneNumber(newPhone);
                    }
                    break;
                case 5:
                    System.out.println("Tên lớp mới:");
                    String newClass = scanner.nextLine();
                    if (newClass != null) {
                        CurrentStudent.setClassName(newClass);
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Bạn nhập sai lựa chọn. Mời bạn nhập lại");
            }
        }
        while (choice != 6);
        studentService.updateStudent(id, CurrentStudent);
    }

    public void displayStudent() {
        int choice;
        do {
            System.out.println("Quản lý codegym :");
            System.out.println("1. Hiển thị danh sách học viên.");
            System.out.println("2. Thêm mới học viên");
            System.out.println("3. Chỉnh sửa thông tin học viên.");
            System.out.println("4. Xóa học viên.");
            System.out.println("5. Quay lại menu.");
            System.out.println("Mời bạn nhập lựa chọn");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Bạn nhập sai lựa chọn. Mời bạn nhập lại.");
            }
        }
        while (true);
    }
}
