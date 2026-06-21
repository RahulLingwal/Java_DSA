package Java03_Sorting.Selection_Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, -5, -1, -10, 9, 8, 5};
        System.out.println("Unsorted array = " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted array = " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = max(arr, 0, last);

            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    static int max(int[] arr, int start, int end) {
        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
