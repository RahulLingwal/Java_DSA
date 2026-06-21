package Java03_Sorting.Insertion_Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

//        int[] arr = {10, 4, 5, 9, 3, 2, 8, 7, 1, 6};
        int[] arr = {1, 5, 6, -5, -1, -10, 9, 8, 5};
        System.out.println("Unsorted array = " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted array = " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
