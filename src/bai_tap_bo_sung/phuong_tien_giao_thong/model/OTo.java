package bai_tap_bo_sung.phuong_tien_giao_thong.model;

public class OTo extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;

    public OTo(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Oto: " + getBienKiemSoat() + ", " + getTenHangSanXuat() + ", " + getNamSanXuat() + ", " + getChuSoHuu() + ", " + soChoNgoi + " chỗ, " + kieuXe);
    }
}
