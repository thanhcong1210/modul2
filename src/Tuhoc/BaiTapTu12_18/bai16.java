package Tuhoc.BaiTapTu12_18;

public class bai16 {
    /*
    viết chương trình :
    tính tổng S = 1! + 2! +3! +....10!
     */
    public static void main(String[] args) {
        int m = 1;
        int tong = 0;
        for (int i = 1; i <= 10; i++) {
            m = i*m; //m *= i
            tong += m;
        }
        System.out.println("tổng cần tính :" + tong);
    }
}
