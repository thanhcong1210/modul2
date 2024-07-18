package bai_tap_bo_sung.quan_ly_trai_cay.model;

public class TraiCay {
    private String ten;
    private String loai;
    private String ngaySanXuat;
    private String hanSuDung;
    private String xuatXu;
    private double gia;

    public TraiCay(String ten, String loai, String ngaySanXuat, String hanSuDung, String xuatXu, double gia) {
        this.ten = ten;
        this.loai = loai;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.xuatXu = xuatXu;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "TraiCay{" +
                "ten='" + ten + '\'' +
                ", loai='" + loai + '\'' +
                ", ngaySanXuat='" + ngaySanXuat + '\'' +
                ", hanSuDung='" + hanSuDung + '\'' +
                ", xuatXu='" + xuatXu + '\'' +
                ", gia=" + gia +
                '}';
    }
}
