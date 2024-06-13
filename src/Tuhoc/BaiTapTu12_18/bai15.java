package Tuhoc.BaiTapTu12_18;

import java.util.Scanner;

public class bai15 {
    /*
    viết chương trình:
    - tiìm những số chia hết cho 3 từ 10 đến 50
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số nguyên n :");
        int n = sc.nextInt();
        for (int i = 10; i <= n; i++) {
            if (i%3 == 0)
                System.out.print(i + " ");
        }
    }
}
