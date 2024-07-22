package bai_tap_bo_sung.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SoNguyenTo {
    public static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Stack<Integer> primeStack(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        return stack;
    }

    public static Queue<Integer> primeQueue(int n) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                queue.add(i);
            }
        }
        return queue;
    }
}
