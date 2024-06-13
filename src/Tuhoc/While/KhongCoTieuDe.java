package Tuhoc.While;

import java.util.Scanner;

public class KhongCoTieuDe {
    /*
    viết chương trình nhập vào số n từ bàn phím
    n phải nằm trong khoảng từ 1 đến 99
    nhập sai bắt nhập lại
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập lại số nguyên từ 1 -> 99 :");
        int n = sc.nextInt();
        while (n < 1 || n > 99) {
            System.out.println("Mời nhập lại số nguyên từ 1 -> 99 :");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n : " + n);
    }
}
