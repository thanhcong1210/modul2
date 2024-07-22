package bai_tap_bo_sung.quan_ly_cong_viec.view;

import bai_tap_bo_sung.quan_ly_cong_viec.controller.ChiTieuController;
import bai_tap_bo_sung.quan_ly_cong_viec.repository.ChiTieuRepository;
import bai_tap_bo_sung.quan_ly_cong_viec.service.ChiTieuService;

public class main {
    public static void main(String[] args) {
        ChiTieuRepository chiTieuRepository = new ChiTieuRepository();
        ChiTieuService chiTieuService = new ChiTieuService(chiTieuRepository);
        ChiTieuController chiTieuController = new ChiTieuController(chiTieuService);

        chiTieuController.showMenu();
    }
}
