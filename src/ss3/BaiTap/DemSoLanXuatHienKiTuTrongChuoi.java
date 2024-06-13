package ss3.BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //mời nhập chuỗi
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        //mời nhập kí tự cần tìm kiếm trong chuỗi
        System.out.print("Enter a character to count : ");
        char character = scanner.next().charAt(0);

        //đếm số lần xuất hiện của kí tự trong chuỗi
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character) {
                count++;
            }
        }

        //hiển thị kết quả ra màn hình
        System.out.println("The character '" + character +"' appears "  + count + " time in the string");
        scanner.close();
    }
}
