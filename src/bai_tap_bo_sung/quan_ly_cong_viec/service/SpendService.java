package bai_tap_bo_sung.quan_ly_cong_viec.service;

import bai_tap_bo_sung.quan_ly_cong_viec.model.Spend;
import bai_tap_bo_sung.quan_ly_cong_viec.repository.ISpendRepository;

import java.util.List;

public class SpendService implements ISpendService {
    private ISpendRepository spendsRepository;

    public SpendService(ISpendRepository spendsRepository) {
        this.spendsRepository = spendsRepository;
    }

    @Override
    public List<Spend> getAllSpends() {
        return spendsRepository.findAll();
    }

    @Override
    public Spend getSpendById(String spendId) {
        return spendsRepository.findById(spendId);
    }

    @Override
    public void addSpend(Spend spend) {
        spendsRepository.save(spend);
    }

    @Override
    public void deleteSpendById(String spendId) {
        spendsRepository.deleteById(spendId);
    }

    @Override
    public List<Spend> searchSpendByName(String spendName) {
        return spendsRepository.findByName(spendName);
    }
}
