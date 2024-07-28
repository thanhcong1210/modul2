package bai_tap_bo_sung.phuong_tien_giao_thong.controller;

import bai_tap_bo_sung.phuong_tien_giao_thong.model.PhuongTien;
import bai_tap_bo_sung.phuong_tien_giao_thong.service.IPhuongTienService;
import bai_tap_bo_sung.phuong_tien_giao_thong.view.PhuongTienView;

import java.util.List;

public class PhuongTienController {
    private IPhuongTienService phuongTienService;
    private PhuongTienView phuongTienView;

    public PhuongTienController(IPhuongTienService phuongTienService) {
        this.phuongTienService = phuongTienService;
        this.phuongTienView = new PhuongTienView();
    }

    public void addPhuongTien(PhuongTien phuongTien){
        phuongTienService.addPhuongTien(phuongTien);
    }

    public void displayAllPhuongTien(){
        List<PhuongTien> phuongTienList = phuongTienService.getAllPhuongTien();
        for (PhuongTien phuongTien : phuongTienList){
            phuongTien.hienThiThongTin();
        }
    }

    public void run() {
    }
}
