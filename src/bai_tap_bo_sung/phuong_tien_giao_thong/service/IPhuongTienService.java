package bai_tap_bo_sung.phuong_tien_giao_thong.service;

import bai_tap_bo_sung.phuong_tien_giao_thong.model.PhuongTien;

import java.util.List;

public interface IPhuongTienService {
    void addPhuongTien(PhuongTien phuongTien);
    List<PhuongTien> getAllPhuongTien();
}
