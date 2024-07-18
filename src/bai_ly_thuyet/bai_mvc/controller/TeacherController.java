package bai_ly_thuyet.bai_mvc.controller;

import bai_ly_thuyet.Teacher;
import bai_ly_thuyet.bai_mvc.service.teacher_service.ITeacherService;
import bai_ly_thuyet.bai_mvc.service.teacher_service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);
    public void display(){
        bai_ly_thuyet.Teacher[] teachers = teacherService.findAll();
        for (Teacher teacher : teachers) {
            if(teacher != null)
            {System.out.println(teacher);};
        }
    }
    public void DisplayTeacherFunctional(){
        int choice;
        do {
            System.out.println("Quản lý Codegym: \n" +
                    "1. Hiển thị danh sách giảng viên. \n" +
                    "2. Thêm mới giảng viên. \n" +
                    "3. Chỉnh sửa thông tin giảng viên. \n" +
                    "4. Xóa giảng viên. \n" +
                    "5. Go back menu. \n" +
                    "Xin chọn");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    System.out.println("Quản lý giảng viên");
                    break;
                case 5:
                    return;
            }
        }
        while(true);
    }
}
