package bai_tap_bo_sung.phuong_tien_giao_thong.repository;

import bai_tap_bo_sung.phuong_tien_giao_thong.model.PhuongTien;

import java.util.List;

public interface IPhuongTienRepository {
    void save(PhuongTien phuongTien);
    List<PhuongTien> findAll();
}
