package ss1.BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double tyGia = 23000;
        double usd;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so tien USD: ");
        usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println("So tien VND la: " + vnd);
    }
}
