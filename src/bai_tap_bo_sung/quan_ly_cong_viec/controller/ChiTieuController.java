package bai_tap_bo_sung.quan_ly_cong_viec.controller;

import bai_tap_bo_sung.quan_ly_cong_viec.model.ChiTieu;
import bai_tap_bo_sung.quan_ly_cong_viec.service.ChiTieuService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ChiTieuController {
    private ChiTieuService chiTieuService;
    private Scanner scanner;

    public ChiTieuController(ChiTieuService chiTieuService) {
        this.chiTieuService = chiTieuService;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm");
            System.out.println("3. Xóa");
            System.out.println("4. Sửa");
            System.out.println("5. Tìm kiếm theo mã chi tiêu");
            System.out.println("6. Tìm kiếm gần đúng theo tên chi tiêu");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayAll();
                    break;
                case 2:
                    addChiTieu();
                    break;
                case 3:
                    deleteChiTieu();
                    break;
                case 4:
                    updateChiTieu();
                    break;
                case 5:
                    searchByMaChiTieu();
                    break;
                case 6:
                    searchByTenChiTieu();
                    break;
                case 7:
                    System.out.println("Thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 7);
    }

    private void displayAll() {
        List<ChiTieu> chiTieuList = chiTieuService.getAllChiTieu();
        chiTieuList.forEach(System.out::println);
    }

    private void addChiTieu() {
        System.out.print("Mã chi tiêu: ");
        String maChiTieu = scanner.nextLine();
        System.out.print("Tên chi tiêu: ");
        String tenChiTieu = scanner.nextLine();
        System.out.print("Ngày chi (dd/MM/yyyy): ");
        Date ngayChiStr = parseDate(scanner.nextLine());

        System.out.print("Số tiền chi: ");
        double soTienChi = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Mô tả thêm: ");
        String moTaThem = scanner.nextLine();

        ChiTieu chiTieu = new ChiTieu(maChiTieu, tenChiTieu, ngayChiStr, soTienChi, moTaThem);
        chiTieuService.addChiTieu(chiTieu);
        System.out.println("Đã thêm chi tiêu thành công.");
    }

    private void deleteChiTieu() {
        System.out.print("Nhập mã chi tiêu cần xóa: ");
        String maChiTieu = scanner.nextLine();
        chiTieuService.deleteChiTieuById(maChiTieu);
        System.out.println("Đã xóa chi tiêu thành công.");
    }

    private void updateChiTieu() {
        System.out.print("Nhập mã chi tiêu cần sửa: ");
        String maChiTieu = scanner.nextLine();
        List<ChiTieu> chiTieuOptional = chiTieuService.getChiTieuById(maChiTieu);

        if (chiTieuOptional.isEmpty()) {
            System.out.print("Tên chi tiêu mới: ");
            String tenChiTieu = scanner.nextLine();
            System.out.print("Ngày chi mới (dd/MM/yyyy): ");
            String ngayChiStr = scanner.nextLine();
            Date ngayChi = parseDate(ngayChiStr);
            System.out.print("Số tiền chi mới: ");
            double soTienChi = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Mô tả thêm mới: ");
            String moTaThem = scanner.nextLine();
            ChiTieu chiTieu = new ChiTieu(maChiTieu, tenChiTieu, ngayChi, soTienChi, moTaThem);
            chiTieuService.addChiTieu(chiTieu);
            System.out.println("Đã cập nhật chi tiêu thành công.");
        } else {
            System.out.println("Không tìm thấy chi tiêu với mã " + maChiTieu);
        }
    }

    private List<ChiTieu> searchByMaChiTieu() {
        System.out.print("Nhập mã chi tiêu cần tìm: ");
        String maChiTieu = scanner.nextLine();
        List<ChiTieu> chiTieuOptional = chiTieuService.getChiTieuById(maChiTieu);

        if (chiTieuOptional.isEmpty()) {
           
            return chiTieuOptional;
        } else {
            System.out.println("Không tìm thấy chi tiêu với mã " + maChiTieu);
            return null;

        }

    }

    private void searchByTenChiTieu() {
        System.out.print("Nhập tên chi tiêu cần tìm: ");
        String tenChiTieu = scanner.nextLine();
        List<ChiTieu> chiTieuList = chiTieuService.searchChiTieuByTen(tenChiTieu);

        if (!chiTieuList.isEmpty()) {
            chiTieuList.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy chi tiêu với tên " + tenChiTieu);
        }
    }

    private Date parseDate(String dateStr) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Ngày không hợp lệ. Vui lòng nhập lại.");
            return null;
        }
    }
}