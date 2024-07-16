package ss1.BaiTap;

import java.util.Scanner;
/*
khai báo biến tỉ giá để lưu giá trị giữa VND và USD
khai báo biến usd để nhập giá trị từ người dùng
tính giá trị VND và in ra màn hình
 */
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double tiGia = 23000;
        double vnd;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri USD: ");
        vnd = scanner.nextDouble();
        System.out.println("Gia tri VND la: " + vnd * tiGia);

    }
}
