package Tuhoc;

import java.util.Scanner;

public class ToanTu3Ngoi {
    //nhập vào bàn phím 1 số, kiểm tra chẵn lẻ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên n : ");
        int n = sc.nextInt();
        String traloi = (n % 2 == 0) ? "chẵn" : "lẻ";
        System.out.println("Số" + n + " là số " + traloi);
    }
}
