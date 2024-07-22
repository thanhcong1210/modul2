package bai_ly_thuyet.bai_mvc_2.view;

import bai_ly_thuyet.bai_mvc_2.controller.StudentController;
import bai_ly_thuyet.bai_mvc_2.controller.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();
        studentController.display();
        TeacherController teacherController = new TeacherController();
        teacherController.display();
        int choice;
        do {
            System.out.println("Quản lý Codegym: \n" +
                    "1. Quản lý hoc viên. \n" +
                    "2. Quản lý giảng viên. \n" +
                    "3. Thoát chương trình. \n" +
                    "Xin chọn");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentController.DisplayStudentFunctional();
                    break;
                case 2:
                    teacherController.DisplayTeacherFunctional();
                    break;
                case 3:
                    System.exit(1);
            }
        }
        while(true);
    }
}
