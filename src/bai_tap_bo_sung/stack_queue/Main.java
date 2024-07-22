package bai_tap_bo_sung.stack_queue;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import static bai_tap_bo_sung.stack_queue.SoNguyenTo.primeQueue;
import static bai_tap_bo_sung.stack_queue.SoNguyenTo.primeStack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên n :");
        int n = scanner.nextInt();

        Stack<Integer> stack = primeStack(n);
        System.out.println("Các số nguyên tố bé hơn :" + n);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        Queue<Integer> queue = primeQueue(n);
        System.out.println("Các số nguyên tố bé hơn :" + n);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        scanner.close();
    }
}
