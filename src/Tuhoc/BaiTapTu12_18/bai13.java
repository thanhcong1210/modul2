package Tuhoc.BaiTapTu12_18;

import java.util.Scanner;

public class bai13 {
    /*
    viết chương trình nhập số a từ bàn phím
    - nếu a chẵn thì tình tổng các số chẵn từ 0 đến a
    - nếu a lẻ thì in ra dòng chữ "tôi 0 tính tổng số lẻ , bye bye" và thoát chương trình
     */
    public static void main(String[] args) {
        int a;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a : ");
        a = sc.nextInt();
        if (a % 2 != 0) {
            System.out.println("Tôi không tính tổng số lẻ, GOOD BYE");
        }else {
            for (int i = 0; i <= a; i+=2) {
                    tong += i;
            }
            System.out.println("Tổng các số chẵn từ 0 đến " + a + " là : " + tong);
        }
    }
}
