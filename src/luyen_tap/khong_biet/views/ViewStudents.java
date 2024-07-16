package luyen_tap.khong_biet.view;

import luyen_tap.khong_biet.models.Student;
import luyen_tap.khong_biet.repositories.StudentsRepo;
import luyen_tap.khong_biet.services.CommonCheck;

import java.util.Scanner;

public class ViewStudents {

    public int viewMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hệ thống quản lí sinh viên");
        System.out.println("1. Thêm mới sinh viên");
        System.out.println("2. Xem danh sách giáo viên");
        System.out.println("3. Xem danh sách sinh viên");
        System.out.println("4. Xóa sinh viên");
        System.out.println("5. Tìm kiếm sinh viên");
        System.out.println("6. Thoát");
        System.out.print("Chọn chức năng: ");
        int choice = scanner.nextInt();
        return choice;
    }
    public Student inputStuden(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String name = CommonCheck.checkRegexPoint();
        String gender;
        boolean check;
        do {
            System.out.println("Nhập ngày sinh :");
            gender = sc.nextLine();
            check = CommonCheck.isDay(gender);
        }while (!check);
        System.out.println("Nhập số điện thoại :");
        String phone = CommonCheck.checkRegexPhone();
        System.out.println("Nhập giới tính học sinh :");
        String email = sc.nextLine();
        String codeClass = StudentsRepo.readCodeClass();
        Student student = new Student(phone, codeClass, email, name, gender);
        return student;
    }
}
