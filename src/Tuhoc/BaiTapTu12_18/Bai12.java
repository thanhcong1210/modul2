package Tuhoc.BaiTapTu12_18;

import java.util.Scanner;

public class Bai12 {
    /*
    viết chương trình nhập vào số nguyên n, in ra kết quả n!
    - dùng vòng lặp for
    - dùng vòng lặp while
     */
    public static void main(String[] args) {
        //for
        // ví dụ : 3! = 1*2*3
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên n :");
        int n = sc.nextInt();
        int gt = 1;
        for (int i = 0; i < n; i++) {
            gt = gt * i;
        }*/

        //while
        int n;
        int i = 1;
        int gt = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên n :");
        n = sc.nextInt();
        while (i <= n) {
            gt = gt * i;
            i++;
        }
        System.out.println(n + "! = " + gt);
    }
}
