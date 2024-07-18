package bai_ly_thuyet.bai_mvc.controller;

import bai_ly_thuyet.Student;
import bai_ly_thuyet.bai_mvc.service.student_service.IStudentService;
import bai_ly_thuyet.bai_mvc.service.student_service.StudentService;
import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    public void display(){
        Student[] students = studentService.findAll();
        for (Student student : students) {
            if(student != null)
            {System.out.println(student);};
        }
    }
    public void DisplayStudentFunctional(){
        int choice;
        do {
            System.out.println("Quản lý Codegym: \n" +
                    "1. Hiển thị danh sách học viên. \n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Chỉnh sửa thông tin học viên. \n" +
                    "4. Xóa học viên. \n" +
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
