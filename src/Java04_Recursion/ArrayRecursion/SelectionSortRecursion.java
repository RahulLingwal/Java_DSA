package Java04_Recursion.ArrayRecursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {7, 5, 4, 1, 2, 9, 3, 6, 8, 10};
        System.out.println("Array = " + Arrays.toString(arr));

        selectionsort(arr, arr.length, 0, 0);
        System.out.println("Sorted Array = " + Arrays.toString(arr));
    }

    static void selectionsort(int[] arr, int r, int c, int maxIndex) {
        if (r == 0) return;

        if (c < r) {
            if (arr[c] > arr[maxIndex]) {
                selectionsort(arr, r, c + 1, c);
            } else {
                selectionsort(arr, r, c + 1, maxIndex);
            }
        } else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[r - 1];
            arr[r - 1] = temp;
            selectionsort(arr, r - 1, 0, 0);
        }
    }
}
