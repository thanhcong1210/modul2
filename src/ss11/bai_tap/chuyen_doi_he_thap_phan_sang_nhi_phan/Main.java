package ss11.bai_tap.chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong he thap phan: ");
        int decimal = scanner.nextInt();

        String binary = decimalToBinary(decimal);
        System.out.println("He nhi phan : " + binary);

        scanner.close();
    }
}
