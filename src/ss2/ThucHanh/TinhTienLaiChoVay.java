package ss2.ThucHanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {

    public static void main(String[] args) {

        double money = 0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter money: ");
        money = input.nextDouble();
        System.out.println("Enter month: ");
        month = input.nextInt();
        System.out.println("Enter interest: ");
        interest_rate = input.nextDouble();

        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = money * (interest_rate / 100 / 12) * 3;
        }
        System.out.println("Total interest: " + total_interest);
    }
}
