package Java04_Recursion.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2, 6, 9, 8, 10, 7};
        System.out.printf("Array = %s", Arrays.toString(arr));

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println("\nSorted Array = " + Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (end + start) / 2;

        mergeSortInPlace(arr, 0, mid);
        mergeSortInPlace(arr, mid, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] mergeArr = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mergeArr[k] = arr[i];
                i++;
            } else {
                mergeArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mergeArr[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mergeArr[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mergeArr.length; l++) {
            arr[start + l] = mergeArr[l];
        }
    }
}
