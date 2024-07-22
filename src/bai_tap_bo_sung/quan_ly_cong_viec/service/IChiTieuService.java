package bai_tap_bo_sung.quan_ly_cong_viec.service;

import bai_tap_bo_sung.quan_ly_cong_viec.model.ChiTieu;

import java.util.List;
import java.util.Optional;

public interface IChiTieuService {
    List<ChiTieu> getAllChiTieu();
    List<ChiTieu> getChiTieuById(String maChiTieu);
    void addChiTieu(ChiTieu chiTieu);
    void deleteChiTieuById(String maChiTieu);
    List<ChiTieu> searchChiTieuByTen(String tenChiTieu);
}
