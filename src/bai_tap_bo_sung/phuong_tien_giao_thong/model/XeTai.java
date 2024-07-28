package bai_tap_bo_sung.phuong_tien_giao_thong.model;

public class XeTai extends PhuongTien{
    private double trongTai;

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("XeTai: " + getBienKiemSoat() + ", " + getTenHangSanXuat() + ", " + getNamSanXuat() + ", " + getChuSoHuu() + ", " + trongTai + " tấn");
    }
}

