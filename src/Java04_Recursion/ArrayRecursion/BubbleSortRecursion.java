package Java04_Recursion.ArrayRecursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 1, 2, 9, 3, 6, 8, 10};
        System.out.println("Sorted Array= " + Arrays.toString(arr));
        
        bubbleSort(arr, arr.length - 1, 0);

        System.out.println("Sorted Array= " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int r, int c) {
        if (r == 0) return;

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c + 1];
                arr[c + 1] = arr[c];
                arr[c] = temp;
            }

            bubbleSort(arr, r, c + 1);
        } else {
            bubbleSort(arr, r - 1, 0);
        }
    }
}
