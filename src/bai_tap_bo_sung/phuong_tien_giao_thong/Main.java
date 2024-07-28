package bai_tap_bo_sung.phuong_tien_giao_thong;

import bai_tap_bo_sung.phuong_tien_giao_thong.controller.PhuongTienController;
import bai_tap_bo_sung.phuong_tien_giao_thong.model.PhuongTien;
import bai_tap_bo_sung.phuong_tien_giao_thong.repository.IPhuongTienRepository;
import bai_tap_bo_sung.phuong_tien_giao_thong.repository.PhuongTienRepository;
import bai_tap_bo_sung.phuong_tien_giao_thong.service.IPhuongTienService;
import bai_tap_bo_sung.phuong_tien_giao_thong.service.PhuongTienService;

public class Main {
    public static void main(String[] args) {
        IPhuongTienRepository phuongTienRepository = new PhuongTienRepository();
        IPhuongTienService phuongTienService = new PhuongTienService(phuongTienRepository);
        PhuongTienController phuongTienController = new PhuongTienController(phuongTienService);
        phuongTienController.run();


    }
}
