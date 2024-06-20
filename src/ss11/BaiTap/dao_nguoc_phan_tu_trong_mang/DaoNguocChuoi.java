package ss11.BaiTap.dao_nguoc_phan_tu_trong_mang;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String inputString = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        System.out.println("chuỗi sau khi đảo ngược: " + str.toString());
    }
}
