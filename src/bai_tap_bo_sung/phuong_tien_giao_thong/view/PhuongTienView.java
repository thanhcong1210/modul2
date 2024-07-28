package bai_tap_bo_sung.phuong_tien_giao_thong.view;

import bai_tap_bo_sung.phuong_tien_giao_thong.controller.PhuongTienController;
import bai_tap_bo_sung.phuong_tien_giao_thong.model.OTo;
import bai_tap_bo_sung.phuong_tien_giao_thong.model.PhuongTien;
import bai_tap_bo_sung.phuong_tien_giao_thong.model.XeTai;


import java.util.Scanner;

public class PhuongTienView {

    private Scanner scanner;

    public PhuongTienView() {
        this.scanner = new Scanner(System.in);
    }


    public void run() {
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("==========================================");
            System.out.println("Chọn chức năng");

            System.out.println("1.Thêm phương tiện ");
            System.out.println("2. Hiển thị danh sách phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addPhuongTien();
                    break;
                case 2:
                    displayAllPhuongTien();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ");
            }
        }
    }

    private void displayAllPhuongTien() {
    }

    public void addPhuongTien() {
        System.out.println("Chọn loại phương tiện : 1.ô tô, 2.xe máy, 3.xe tải");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();

        PhuongTien phuongTien = null;
        switch (choice) {
            case 1:
                System.out.print("Nhập số chỗ ngồi: ");
                int soChoNgoi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập kiểu xe: ");
                String kieuXe = scanner.nextLine();
                phuongTien = new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi);
                break;
            case 2:
                System.out.print("Nhập trọng tải: ");
                double trongTai = scanner.nextDouble();
                phuongTien = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
                break;
            case 3:
                System.out.println("Nhập công suất : ");
                double congSuat = scanner.nextDouble();
                phuongTien = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
                break;
            default:
                System.out.println("Chọn loại phương tiện không hợp lệ");
                return;
        }

    }
}




