package bai_tap_bo_sung.quan_ly_cong_viec.repository;

import bai_tap_bo_sung.quan_ly_cong_viec.model.ChiTieu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChiTieuRepository implements IChiTieuRepository {
    private List<ChiTieu> chiTieuList = new ArrayList<>();

    @Override
    public List<ChiTieu> findAll() {
        return new ArrayList<>(chiTieuList);
    }

    @Override
    public List<ChiTieu> findById(String maChiTieu) {
        List<ChiTieu> result = new ArrayList<>();
        for (ChiTieu chiTieu : chiTieuList) {
            if (chiTieu.getMaChiTieu().equals(maChiTieu)) {
                result.add(chiTieu);
            }
        }
        return result;
    }

    @Override
    public void save(ChiTieu chiTieu) {
        chiTieuList.add(chiTieu);
    }

    @Override
    public void deleteById(String maChiTieu) {
        chiTieuList.removeIf(c -> c.getMaChiTieu().equals(maChiTieu));
    }

    @Override
    public List<ChiTieu> findByTenChiTieu(String tenChiTieu) {
        return chiTieuList.stream().filter(c -> c.getTenChiTieu().equalsIgnoreCase(tenChiTieu)).collect(Collectors.toList());
    }
}
