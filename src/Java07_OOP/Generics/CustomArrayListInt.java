package Java07_OOP.Generics;

import java.util.Arrays;

public class CustomArrayListInt {
    private static final int DEFAULT_SIZE = 5;
    private int[] data;
    private int size = 0;

    public CustomArrayListInt() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        data[size] = 0;
        return removed;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return data[index];
    }

    public String toString() {
        return Arrays.toString(data);
    }

    public void set(int index, int value) {
        data[index] = value;
        size++;
    }

    public void main(String[] args) {
        CustomArrayListInt arr = new CustomArrayListInt();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        arr.set(6, 8);

        System.out.println(arr);
        System.out.println("Length of array = " + arr.size());
        System.out.println("Element removed from array = " + arr.remove());
        System.out.println(arr);

        System.out.println("Element at given index = " + arr.get(2));
    }
}
