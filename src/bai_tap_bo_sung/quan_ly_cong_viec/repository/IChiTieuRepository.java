package bai_tap_bo_sung.quan_ly_cong_viec.repository;

import bai_tap_bo_sung.quan_ly_cong_viec.model.ChiTieu;

import java.util.List;
import java.util.Optional;

public interface IChiTieuRepository {
    List<ChiTieu> findAll();
    List<ChiTieu> findById(String maChiTieu);
    void save(ChiTieu chiTieu);
    void deleteById(String maChiTieu);
    List<ChiTieu> findByTenChiTieu(String tenChiTieu);
}
