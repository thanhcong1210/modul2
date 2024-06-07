package ss1.BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so tien USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("So tien VND la: " + quydoi);
    }
}
