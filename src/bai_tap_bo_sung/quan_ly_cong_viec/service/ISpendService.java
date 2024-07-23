package bai_tap_bo_sung.quan_ly_cong_viec.service;

import bai_tap_bo_sung.quan_ly_cong_viec.model.Spend;

import java.util.List;

public interface ISpendService {
    List<Spend> getAllSpends();
    Spend getSpendById(String spendId);
    void addSpend(Spend spendMoi);
    void deleteSpendById(String spendId);
    List<Spend> searchSpendByName(String spendName);
}
