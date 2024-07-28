package bai_tap_bo_sung.phuong_tien_giao_thong.repository;

import bai_tap_bo_sung.phuong_tien_giao_thong.model.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository implements IPhuongTienRepository{

    private List<PhuongTien> phuongTienList = new ArrayList<PhuongTien>();


    @Override
    public void save(PhuongTien phuongTien) {
        phuongTienList.add(phuongTien);
    }

    @Override
    public List<PhuongTien> findAll() {
        return phuongTienList;
    }
}
