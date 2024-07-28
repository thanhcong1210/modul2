package bai_tap_bo_sung.phuong_tien_giao_thong.service;

import bai_tap_bo_sung.phuong_tien_giao_thong.model.PhuongTien;
import bai_tap_bo_sung.phuong_tien_giao_thong.repository.IPhuongTienRepository;
import bai_tap_bo_sung.phuong_tien_giao_thong.repository.PhuongTienRepository;

import java.util.List;

public class PhuongTienService implements IPhuongTienService {
    private IPhuongTienRepository phuongTienRepository;

    public PhuongTienService(IPhuongTienRepository phuongTienRepository) {
        this.phuongTienRepository = phuongTienRepository;
    }

    @Override
    public void addPhuongTien(PhuongTien phuongTien) {
        phuongTienRepository.save(phuongTien);
    }

    @Override
    public List<PhuongTien> getAllPhuongTien() {
        return phuongTienRepository.findAll();
    }
}
