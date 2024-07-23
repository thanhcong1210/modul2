package bai_tap_bo_sung.quan_ly_cong_viec.view;

import bai_tap_bo_sung.quan_ly_cong_viec.model.Spend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SpendView {
    private Scanner scanner;

    public SpendView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("1.Hiển thị danh sách");
        System.out.println("2. Thêm");
        System.out.println("3. Xóa");
        System.out.println("4. Cập nhật");
        System.out.println("5. Tìm kiếm chi tiêu theo ID");
        System.out.println("6. Tìm kiếm chi tiêu theo tên");
        System.out.println("7. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
    }

    public Spend getSpendDetails(){
        System.out.print("Nhập chi tiêu ID: ");
        String spendId = scanner.nextLine();
        System.out.println("Nhập chi tiêu Name : ");
        String spendName = scanner.nextLine();
        System.out.print("Nhập dữ liệu chi tiêu (dd/MM/yyyy) : ");
        String spendDateStr = scanner.nextLine();
        Date spendDate = parseDate(spendDateStr);
        System.out.println("Số tiền chi tiêu : ");
        double spendAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Mô tả  :");
        String additionalDescription = scanner.nextLine();

        return new Spend(spendId, spendName, spendDate, spendAmount, additionalDescription);
    }

    public String getSpendId(){
        System.out.println("Nhập chi tiêu ID:");
        return scanner.nextLine();
    }

    public String getSpendName(){
        System.out.println("Nhập chi tiêu Name :");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displaySpendList(List<Spend> spendList) {
        for (Spend spend : spendList) {
            System.out.println(spend);
        }
    }

    public Scanner getScanner() {
        return scanner;
    }

    private Date parseDate(String dateStr) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }
}
