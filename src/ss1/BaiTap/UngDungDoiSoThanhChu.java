package ss1.BaiTap;

import java.util.Scanner;

public class UngDungDoiSoThanhChu {

    public static final String[] UNITS = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    public static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên không âm :");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ. Vui lòng nhập số nguyên không âm lên đến 3 chữ số");
            return;
        }

        String word = convertToWords(number);
        System.out.println(word);
    }

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
