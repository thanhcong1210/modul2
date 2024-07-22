package bai_tap_bo_sung.quan_ly_cong_viec.model;

import java.util.Date;

public class ChiTieu {
    private String maChiTieu;
    private String tenChiTieu;
    private Date ngayChi;
    private double soTienChi;
    private String moTaThem;

    // Constructor
    public ChiTieu(String maChiTieu, String tenChiTieu, Date ngayChi, double soTienChi, String moTaThem) {
        this.maChiTieu = maChiTieu;
        this.tenChiTieu = tenChiTieu;
        this.ngayChi = ngayChi;
        this.soTienChi = soTienChi;
        this.moTaThem = moTaThem;
    }

    // Getters and Setters
    public String getMaChiTieu() {
        return maChiTieu;
    }

    public void setMaChiTieu(String maChiTieu) {
        this.maChiTieu = maChiTieu;
    }

    public String getTenChiTieu() {
        return tenChiTieu;
    }

    public void setTenChiTieu(String tenChiTieu) {
        this.tenChiTieu = tenChiTieu;
    }

    public Date getNgayChi() {
        return ngayChi;
    }

    public void setNgayChi(Date ngayChi) {
        this.ngayChi = ngayChi;
    }

    public double getSoTienChi() {
        return soTienChi;
    }

    public void setSoTienChi(double soTienChi) {
        this.soTienChi = soTienChi;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }

    @Override
    public String toString() {
        return "ChiTieu [maChiTieu=" + maChiTieu + ", tenChiTieu=" + tenChiTieu + ", ngayChi=" + ngayChi + ", soTienChi=" + soTienChi + ", moTaThem=" + moTaThem + "]";
    }
}
