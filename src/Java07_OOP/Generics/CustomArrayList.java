package Java07_OOP.Generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private static final int DEFAULT_SIZE = 5;
    private Object[] data;
    private int size = 0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> arr = new CustomArrayList<>();
        arr.add(8);
        arr.add(9);
        arr.add(10);

        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.remove());
        System.out.println(arr);
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
        if (size == 0) {
            throw new IllegalStateException("Cannot remove from an empty list.");
        }

        T removed = (T) (data[--size]);
        data[size] = null;
        return removed;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) data[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        data[index] = value;
    }
}
