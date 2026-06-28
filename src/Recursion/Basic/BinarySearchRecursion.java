package Recursion.Basic;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 9, 11, 18, 20, 22};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter target = ");
        int target = in.nextInt();

        int ans = binarySearch(arr, target, 0, arr.length - 1);
        if (ans != -1) {
            System.out.println("Element found at index = " + ans);
        } else {
            System.out.println("Element not found!");
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (end < start) return -1;

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) return mid;

        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        } else {
            return binarySearch(arr, target, start, mid - 1);
        }
    }
}
