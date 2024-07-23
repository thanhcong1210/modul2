package bai_ly_thuyet.bai_mvc_2.view;

import bai_ly_thuyet.bai_mvc_2.controller.TeacherController;
import bai_ly_thuyet.bai_mvc_2.model.Teacher;

import java.time.LocalDate;
import java.util.Scanner;

public class TeacherView {
    private TeacherController teacherController;
    private Scanner sc = new Scanner(System.in);

    public TeacherView(TeacherController teacherController) {
        this.teacherController = teacherController;
    }

    public void display() {
        teacherController.getAllTeachers().forEach(System.out::println);
    }

    public void editTeacher() {
        System.out.print("Nhập ID của giảng viên cần chỉnh sửa: ");
        String id = sc.nextLine();

        Teacher existingTeacher = teacherController.getTeacherById(id);
        if (existingTeacher == null) {
            System.out.println("Không tìm thấy giảng viên có ID là: " + id);
            return;
        }

        System.out.println("Thông tin giảng viên cần chỉnh sửa:");
        System.out.println(existingTeacher);

        int choice;
        do {
            System.out.println("Chọn thông tin cần chỉnh sửa: \n" +
                    "1. Tên. \n" +
                    "2. Ngày sinh. \n" +
                    "3. Email. \n" +
                    "4. Số điện thoại. \n" +
                    "5. Cấp bậc. \n" +
                    "6. Hoàn thành. \n"
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Tên mới:");
                    String newName = sc.nextLine();
                    existingTeacher.setName(newName);
                    break;
                case 2:
                    System.out.println("Ngày sinh mới:");
                    LocalDate newBirthday = LocalDate.parse(sc.nextLine());
                    existingTeacher.setBirthDate(newBirthday);
                    break;
                case 3:
                    System.out.println("Email mới:");
                    String newEmail = sc.nextLine();
                    existingTeacher.setEmail(newEmail);
                    break;
                case 4:
                    System.out.println("SĐT mới:");
                    String newPhoneNumber = sc.nextLine();
                    existingTeacher.setPhoneNumber(newPhoneNumber);
                    break;
                case 5:
                    System.out.println("Cấp bậc mới:");
                    String newLevel = sc.nextLine();
                    existingTeacher.setLevel(newLevel);
                    break;
            }
        } while (choice != 6);
        teacherController.updateTeacher(id, existingTeacher);
    }

    public void addTeacher() {
        System.out.println("Nhập id");
        String id = sc.nextLine();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        System.out.println("Nhập cấp bậc: ");
        String level = sc.nextLine();

        Teacher teacher = new Teacher(id, name, birthday, email, phone, level);
        teacherController.addTeacher(teacher);
    }

    public void deleteTeacher() {
        System.out.print("Nhập ID của giảng viên cần xóa: ");
        String id = sc.nextLine();

        Teacher existingTeacher = teacherController.getTeacherById(id);
        if (existingTeacher == null) {
            System.out.println("Không tìm thấy giảng viên có ID là: " + id);
            return;
        }
        System.out.println("Thông tin giảng viên cần xóa:");
        System.out.println(existingTeacher);
        if (teacherController.deleteTeacher(id)) {
            System.out.println("Xóa thành công");
        }
    }

    public void displayTeacherFunctional() {
        int choice;
        do {
            System.out.println("Quản lý giảng viên: \n" +
                    "1. Hiển thị danh sách giảng viên. \n" +
                    "2. Thêm mới giảng viên. \n" +
                    "3. Chỉnh sửa thông tin giảng viên. \n" +
                    "4. Xóa giảng viên. \n" +
                    "5. Quay lại menu chính. \n" +
                    "Xin chọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    editTeacher();
                    break;
                case 4:
                    deleteTeacher();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}