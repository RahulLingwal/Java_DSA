package Java04_Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2, 6, 9, 8, 10, 7};
        System.out.printf("Array = %s", Arrays.toString(arr));

        int[] ans = mergeSort(arr);
        System.out.println("\nSorted Array = " + Arrays.toString(ans));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mergeArr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergeArr[k] = left[i];
                i++;
            } else {
                mergeArr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mergeArr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mergeArr[k] = right[j];
            j++;
            k++;
        }

        return mergeArr;
    }
}
