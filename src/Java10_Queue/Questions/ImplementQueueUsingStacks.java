package Java10_Queue.Questions;

// https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        for (int i = 1; i <= 5; i++) {
            queue.push(i);
            System.out.print(i + " <- ");
        }

        System.out.println("\nPopped = " + queue.pop());
        System.out.println("Peek = " + queue.peek());
    }
}

class MyQueue {
    private int ptr = -1;
    private Stack<Integer> stackFirst;
    private Stack<Integer> stackSecond;

    public MyQueue() {
        stackFirst = new Stack<>();
        stackSecond = new Stack<>();
    }

    public void push(int x) {
        stackFirst.push(x);
    }

    public int pop() {
        if (stackFirst.isEmpty()) {
            return -1;
        }

        while (!stackFirst.isEmpty()) {
            stackSecond.push(stackFirst.pop());
        }

        int removed = stackSecond.pop();

        while (!stackSecond.isEmpty()) {
            stackFirst.push(stackSecond.pop());
        }

        return removed;
    }

    public int peek() {
        if (stackFirst.isEmpty()) {
            return -1;
        }

        while (!stackFirst.isEmpty()) {
            stackSecond.push(stackFirst.pop());
        }

        int peek = stackSecond.peek();

        while (!stackSecond.isEmpty()) {
            stackFirst.push(stackSecond.pop());
        }

        return peek;
    }

    public boolean empty() {
        if (stackFirst.isEmpty()) {
            return true;
        }
        return false;
    }
}
