package bai_tap_bo_sung.quan_ly_cong_viec.repository;

import bai_tap_bo_sung.quan_ly_cong_viec.model.Spend;

import java.util.ArrayList;
import java.util.List;

public class SpendRepository implements ISpendRepository{
    private List<Spend> spendList = new ArrayList<>();

    @Override
    public List<Spend> findAll() {
        return new ArrayList<>(spendList);
    }

    @Override
    public Spend findById(String spendId) {
        for (Spend spend : spendList) {
            if (spend.getSpendId().equals(spendId)) {
                return spend;
            }
        }
        return null;
    }

    @Override
    public void save(Spend spend) {
        spendList.add(spend);
    }

    @Override
    public void deleteById(String spendId) {
        for (int i = 0; i < spendList.size(); i++) {
            if (spendList.get(i).getSpendId().equals(spendId)){
                spendList.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Spend> findByName(String spendName){
        List<Spend> result = new ArrayList<>();
        for (Spend spend : spendList){
            if (spend.getSpendName().contains(spendName)){
                result.add(spend);
            }
        }
        return result;
    }
}
