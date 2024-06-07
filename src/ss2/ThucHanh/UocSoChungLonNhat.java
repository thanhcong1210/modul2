package ss2.ThucHanh;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap a: ");
        a = scanner.nextInt();
        System.out.println("Moi nhap b: ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Uoc so chung lon nhat la: " + 0);
        }
        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
            System.out.println("Uoc so chung lon nhat la: " + a);
        }
    }
}
