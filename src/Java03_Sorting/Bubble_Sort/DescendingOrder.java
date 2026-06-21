package Java03_Sorting.Bubble_Sort;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 9, 3, 2, 8, 7, 1, 6};
//        int[] arr = {1, 5, 6, -5, -1, -10, 9, 8, 5};
        System.out.println("Unsorted array = " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Descending Sorted array = " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
