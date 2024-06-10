package ss3.BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to count : ");
        char character = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("The character '" + character +"' appears "  + count + " time in the string");
        scanner.close();
    }
}
