package bai_tap_bo_sung.quan_ly_trai_cay.view;

import bai_tap_bo_sung.quan_ly_trai_cay.model.TraiCay;

import java.util.List;
import java.util.Scanner;

public class TraiCayView {
    private Scanner scanner = new Scanner(System.in);

    public void hienThiDanhSach(List<TraiCay> danhSachTraiCay) {
        for (TraiCay traiCay : danhSachTraiCay) {
            System.out.println(traiCay);
        }
    }

    public TraiCay nhapThongTinTraiCay() {
        System.out.println("Nhập tên trái cây: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập loại trái cây: ");
        String loai = scanner.nextLine();

        System.out.println("Nhập ngày sản xuất: ");
        String ngaySanXuat = scanner.nextLine();
        System.out.println("Nhập hạn sử dụng: ");
        String hanSuDung = scanner.nextLine();
        System.out.println("Nhập xuất xứ: ");
        String xuatXu = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double gia = scanner.nextDouble();
        scanner.nextLine();

        return new TraiCay(ten, loai, ngaySanXuat, hanSuDung, xuatXu, gia);
    }

    public int hienThiMenu(){
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm");
        System.out.println("3. Thoát");
        System.out.print("Chọn chức năng: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
