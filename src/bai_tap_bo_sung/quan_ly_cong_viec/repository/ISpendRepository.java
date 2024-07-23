package bai_tap_bo_sung.quan_ly_cong_viec.repository;

import bai_tap_bo_sung.quan_ly_cong_viec.model.Spend;

import java.util.List;

public interface ISpendRepository {
    List<Spend> findAll();
    Spend findById(String spendId);
    void save(Spend spend);
    void deleteById(String spendId);
    List<Spend> findByName(String spendName);
}
