package Java09_Stack;

import java.util.Arrays;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    int[] stack;
    private int ptr = -1;
    private int size = 0;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.stack = new int[size];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        stack[++ptr] = value;
        size++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from empty stack!");
        }

        int removed = stack[ptr];
        ptr--;
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from empty stack!");
        }

        return stack[ptr];
    }

    public int size() {
        return size;
    }

    boolean isFull() {
        return ptr == stack.length - 1;
    }

    boolean isEmpty() {
        return ptr == -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(stack, size));
    }
}
