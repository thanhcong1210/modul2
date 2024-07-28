package bai_ly_thuyet.Stack_va_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyStack {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>();
//        Queue<Integer> queue2 = new LinkedList<>();
//        Queue<Integer> queue3 = new PriorityQueue<>();
        queue1.add(3);
        queue1.add(2);
        queue1.add(7);
        queue1.add(4);
        System.out.println(queue1);
        queue1.poll();
        System.out.println(queue1);
    }
}
