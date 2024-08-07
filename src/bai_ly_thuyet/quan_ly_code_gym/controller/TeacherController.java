package bai_ly_thuyet.quan_ly_code_gym.controller;

import bai_ly_thuyet.quan_ly_code_gym.model.Teacher;
import bai_ly_thuyet.quan_ly_code_gym.service.ITeacherService;
import bai_ly_thuyet.quan_ly_code_gym.service.TeacherService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        ArrayList<Teacher> teachers = teacherService.findAll();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void addTeacher() {
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String phone = scanner.nextLine();
        System.out.println("Nhập cấp bậc");
        String level = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, birthDate, email, phone, level);
        teacherService.addTeacher(teacher);
    }

    public void deleteTeacher() {
        System.out.println("Nhập id giảng viên cần xóa");
        int id = scanner.nextInt();
        Teacher currentTeacher = teacherService.findTeacherById(id);
        if (currentTeacher == null) {
            System.out.println("Không tìm thấy giáo viên với id: " + id);
            return;
        }
        System.out.println("Thông tin giảng viên cần xóa");
        System.out.println(currentTeacher);
        if (teacherService.deleteTeacher(id)) {
            System.out.println("Xóa thành công");
        }
    }

    public void displayTeacher() {
        int choice;
        do {
            System.out.println("Quản lý giảng viên: ");
            System.out.println("1. Hiển thị danh sách giảng viên.");
            System.out.println("2. Thêm mới giảng viên.");
            System.out.println("3. Xóa giảng viên.");
            System.out.println("4. Chỉnh sửa thông tin giảng viên.");
            System.out.println("5. Quay lại menu chính.");
            System.out.println("Xin chọn:");

            choice = Integer.parseInt(scanner.nextLine());
            scanner.nextLine();
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    deleteTeacher();
                    break;
                case 4:
                    updateTeacher();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }


    public void updateTeacher() {
        System.out.println("Nhập id giáo viên cần chỉnh sửa :");
        int id = scanner.nextInt();
        Teacher currentTeacher = teacherService.findTeacherById(id);
        if (currentTeacher == null) {
            System.out.println("Không tìm thấy giáo viên với id: " + id);
            return;
        }
        System.out.println("Thông tin giáo viên cần chỉnh sửa.");
        System.out.println(currentTeacher);

        int choice;
        do {
            System.out.println("Chọn thông tin giáo viên cần chỉnh sửa");
            System.out.println("1. Tên");
            System.out.println("2. Ngày sinh");
            System.out.println("3. Email");
            System.out.println("4. Số điện thoại");
            System.out.println("5. Cấp bậc");
            System.out.println("6. Hoàn thành");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Tên mới:");
                    String answer = scanner.nextLine();
                    currentTeacher.setName(answer);
                    break;
                case 2:
                    System.out.println("Ngày sinh mới:");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    currentTeacher.setDateOfBirth(date);
                    break;
                case 3:
                    System.out.println("Email mới:");
                    String email = scanner.nextLine();
                    currentTeacher.setEmail(email);
                    break;
                case 4:
                    System.out.println("Số điện thoại mới:");
                    String newPhone = scanner.nextLine();
                    currentTeacher.setPhoneNumber(newPhone);
                    break;
                case 5:
                    System.out.println("Cấp bậc mới:");
                    String newLevel = scanner.nextLine();
                    currentTeacher.setLevel(newLevel);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Mời bạn chọn lại!!!");
            }
        }
        while (choice != 6);
        teacherService.updateTeacher(id, currentTeacher);
    }
}
