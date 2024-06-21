package ss11.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String input){
        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                stack.push(c);
                queue.add(c);
            }
        }
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.remove();
            if (stackChar!= queueChar) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Day la day chuoi Palindrome: ");
        }else {
            System.out.println("Day khong phai la day chuoi Palindrome: ");
        }
        scanner.close();
    }
}
