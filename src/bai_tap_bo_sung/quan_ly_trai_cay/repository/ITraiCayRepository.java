package bai_tap_bo_sung.quan_ly_trai_cay.repository;

import bai_tap_bo_sung.quan_ly_trai_cay.model.TraiCay;

import java.util.List;

public interface ITraiCayRepository {
    List<TraiCay> getAllTraiCay();

    void addTraiCay(TraiCay traiCayMoi);
}
