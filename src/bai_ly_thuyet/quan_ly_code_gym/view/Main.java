package bai_ly_thuyet.quan_ly_code_gym.view;

import bai_ly_thuyet.quan_ly_code_gym.controller.StudentController;
import bai_ly_thuyet.quan_ly_code_gym.controller.TeacherController;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        int choice;
        do {
            System.out.println("Quản lý Codegym : ");
            System.out.println("1. Quản lý học viên : ");
            System.out.println("2. Quản lý giảng viên :");
            System.out.println("3. Thoát chương trình : ");
            System.out.println("Mời bạn nhập lựa chọn : ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentController.displayStudent();
                    break;
                case 2:
                    teacherController.displayTeacher();
                    break;
                case 3:
                    System.out.println("Đang thoát chương trình...");
                    scanner.close();
                    System.exit(0);
            }
        } while (true);
    }
}
