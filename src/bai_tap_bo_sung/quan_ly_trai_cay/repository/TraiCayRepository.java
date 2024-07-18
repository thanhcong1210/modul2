package bai_tap_bo_sung.quan_ly_trai_cay.repository;

import bai_tap_bo_sung.quan_ly_trai_cay.model.TraiCay;

import java.util.ArrayList;
import java.util.List;

public class TraiCayRepository {
    private List<TraiCay> danhSachTraiCay = new ArrayList<>();

    public List<TraiCay> findAll() {
        return new ArrayList<>(danhSachTraiCay);
    }

    public void save(TraiCay traiCay) {
        danhSachTraiCay.add(traiCay);
    }

}
