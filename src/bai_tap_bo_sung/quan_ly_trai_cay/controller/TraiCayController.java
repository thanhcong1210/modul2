package bai_tap_bo_sung.quan_ly_trai_cay.controller;

import bai_tap_bo_sung.quan_ly_trai_cay.model.TraiCay;
import bai_tap_bo_sung.quan_ly_trai_cay.service.ITraiCayService;
import bai_tap_bo_sung.quan_ly_trai_cay.service.TraiCayService;
import bai_tap_bo_sung.quan_ly_trai_cay.view.TraiCayView;

import java.util.List;

public class TraiCayController {
    private ITraiCayService traiCayService  = new TraiCayService();
    private TraiCayView traiCayView = new TraiCayView();

    public void chayChuongTrinh() {
        boolean running = true;
        while (running) {
            int luaChon = traiCayView.hienThiMenu();
            switch (luaChon) {
                case 1:
                    List<TraiCay> danhSachTraiCay = traiCayService.getAllTraiCay();
                    traiCayView.hienThiDanhSach(danhSachTraiCay);
                    break;
                case 2:
                    TraiCay traiCayMoi = traiCayView.nhapThongTinTraiCay();
                    traiCayService.addTraiCay(traiCayMoi);
                    System.out.println("Thêm trái cây thành công!");
                    break;
                case 3:
                    running = false;
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
}
