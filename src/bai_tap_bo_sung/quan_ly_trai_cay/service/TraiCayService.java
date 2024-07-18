package bai_tap_bo_sung.quan_ly_trai_cay.service;

import bai_tap_bo_sung.quan_ly_trai_cay.model.TraiCay;
import bai_tap_bo_sung.quan_ly_trai_cay.repository.TraiCayRepository;

import java.util.List;

public class TraiCayService {
    private TraiCayRepository traiCayRepository;

    public TraiCayService() {
        traiCayRepository = new TraiCayRepository();
    }

    public List<TraiCay> getAllTraiCay() {
        return traiCayRepository.findAll();
    }

    public void addTraiCay(TraiCay traiCay) {
        traiCayRepository.save(traiCay);
    }
}
