package bai_tap_bo_sung.quan_ly_cong_viec.service;

import bai_tap_bo_sung.quan_ly_cong_viec.model.ChiTieu;
import bai_tap_bo_sung.quan_ly_cong_viec.repository.ChiTieuRepository;
import bai_tap_bo_sung.quan_ly_cong_viec.repository.IChiTieuRepository;

import java.util.List;
import java.util.Optional;

public class ChiTieuService implements IChiTieuService {
    private ChiTieuRepository chiTieuRepository;

    public ChiTieuService(ChiTieuRepository chiTieuRepository) {
        this.chiTieuRepository = chiTieuRepository;
    }

    @Override
    public List<ChiTieu> getAllChiTieu() {
        return chiTieuRepository.findAll();
    }

    @Override
    public List<ChiTieu> getChiTieuById(String maChiTieu) {
        return chiTieuRepository.findById(maChiTieu);
    }

    @Override
    public void addChiTieu(ChiTieu chiTieu) {
        chiTieuRepository.save(chiTieu);
    }

    @Override
    public void deleteChiTieuById(String maChiTieu) {
        chiTieuRepository.deleteById(maChiTieu);
    }

    @Override
    public List<ChiTieu> searchChiTieuByTen(String tenChiTieu) {
        return chiTieuRepository.findByTenChiTieu(tenChiTieu);
    }
}
