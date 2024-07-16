package ss1.BaiTap;

import java.util.Scanner;

public class UngDungDoiSoThanhChu {

    //mảng chứa các số từ 0 đến 19 dưới dạng chữ
    public static final String[] UNITS = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    //mảng chứa bội số của 10 từ 20->90 dưới dạng chữ
    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //yêu cầu người dùng nhập vào 1 số nguyên không âm
        System.out.print("Enter a non-negative integer : ");
        int number = scanner.nextInt();

        //kiểm tra số đã nhập vào có hợp lệ hay không
        if (number < 0 || number > 999) {
            System.out.println("Invalid number. Please enter a non-negative integer up to 3 digits.");
            return;
        }

        //chuyển số thành chữ và in ra màn hình
        String word = convertToWords(number);
        System.out.println(word);
    }

    //phương thức để chuyển đổi số thành chữ
    public static String convertToWords(int number) {
        if(number == 0){
            return "zero";
        }
        if (number < 20) {
            return UNITS[number];
        }
        if (number < 100) {
            return TENS[number / 10] + " " + UNITS[number % 10];
        }
        return UNITS[number / 100] + "hundred" + convertToWords(number % 100);
    }
}
