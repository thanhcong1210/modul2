package bai_tap_bo_sung.phuong_tien_giao_thong.model;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() { return bienKiemSoat; }
    public String getTenHangSanXuat() { return tenHangSanXuat; }
    public int getNamSanXuat() { return namSanXuat; }
    public String getChuSoHuu() { return chuSoHuu; }

    public abstract void hienThiThongTin();
}

