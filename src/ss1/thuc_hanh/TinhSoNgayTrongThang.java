package ss1.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao thang: ");
        int month = scanner.nextInt();

        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            case 2:
                daysInMonth = "28";
                break;
            default:
                daysInMonth = "Khong hop le";
                break;
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days", month, daysInMonth);
        else System.out.print("Invalid input");
    }
}
