package bai_ly_thuyet.bai_mvc_2;

import bai_ly_thuyet.bai_mvc_2.controller.StudentController;
import bai_ly_thuyet.bai_mvc_2.controller.TeacherController;
import bai_ly_thuyet.bai_mvc_2.view.StudentView;
import bai_ly_thuyet.bai_mvc_2.view.TeacherView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        StudentView studentView = new StudentView(studentController);
        TeacherView teacherView = new TeacherView(teacherController);

        int choice;
        do {
            System.out.println("Quản lý Codegym: \n" +
                    "1. Quản lý học viên. \n" +
                    "2. Quản lý giảng viên. \n" +
                    "3. Thoát chương trình. \n" +
                    "Xin chọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentView.displayStudentFunctional();
                    break;
                case 2:
                    teacherView.displayTeacherFunctional();
                    break;
                case 3:
                    System.out.println("Đang thoát chương trình...");
                    sc.close();
                    System.exit(0);
            }
        } while (true);
    }
}