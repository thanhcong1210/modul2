package bai_tap_bo_sung.luyen_tap_trien_khai_class.controller;

import bai_tap_bo_sung.luyen_tap_trien_khai_class.model.Doctor;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Nguyễn Văn B", 40, "số 1 Việt Nam", "vanB@gmail.com","0123456789", "Chủ Tịch");
        doctor.displayInfor();
    }
}
