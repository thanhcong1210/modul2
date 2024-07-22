package bai_tap_bo_sung.quan_ly_trai_cay.repository;

import bai_tap_bo_sung.quan_ly_trai_cay.model.TraiCay;

import java.util.ArrayList;
import java.util.List;

public class TraiCayRepository implements ITraiCayRepository{
    private List<TraiCay> danhSachTraiCay = new ArrayList<>();


    @Override
    public List<TraiCay> getAllTraiCay() {
        return danhSachTraiCay;
    }

    @Override
    public void addTraiCay(TraiCay traiCayMoi) {
        danhSachTraiCay.add(traiCayMoi);
    }
}
