package Java03_Sorting.Cycle_Sort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 2, 7, 3, 4, 6, 8, 10};
        System.out.printf("Unsorted array = %s \n", Arrays.toString(arr));

        cycleSort(arr);

        System.out.printf("Sorted array = %s", Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;
    }
}
