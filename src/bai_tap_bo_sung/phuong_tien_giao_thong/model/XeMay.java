package bai_tap_bo_sung.phuong_tien_giao_thong.model;

public class XeMay extends PhuongTien{
    private double congSuat;

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("XeMay: " + getBienKiemSoat() + ", " + getTenHangSanXuat() + ", " + getNamSanXuat() + ", " + getChuSoHuu() + ", " + congSuat + " mã lực");
    }
}
