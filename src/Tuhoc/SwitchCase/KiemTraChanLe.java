package Tuhoc.SwitchCase;

import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
        int a = sc.nextInt();
        // kiểm tra số dư của a cho 2
        int div = a%2;
        switch (div){
            case 0 :
                System.out.println(a + "là số chẵn");
                break;
            default:
                System.out.println(a + "là số lẻ");
                break;
        }
    }
}
