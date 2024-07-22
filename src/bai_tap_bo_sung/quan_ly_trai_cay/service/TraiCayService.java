package bai_tap_bo_sung.quan_ly_trai_cay.service;

import bai_tap_bo_sung.quan_ly_trai_cay.model.TraiCay;
import bai_tap_bo_sung.quan_ly_trai_cay.repository.ITraiCayRepository;
import bai_tap_bo_sung.quan_ly_trai_cay.repository.TraiCayRepository;

import java.util.List;

public class TraiCayService implements ITraiCayService{
    private ITraiCayRepository traiCayRepository = new TraiCayRepository();


    @Override
    public List<TraiCay> getAllTraiCay() {
        return traiCayRepository.getAllTraiCay();
    }

    @Override
    public void addTraiCay(TraiCay traiCayMoi) {
        traiCayRepository.addTraiCay(traiCayMoi);
    }
}
