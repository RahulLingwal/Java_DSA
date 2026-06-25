package Java02_Searching.Binary_Search;

import java.util.Scanner;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};

        System.out.println("Choose How to count");
        System.out.println("1. Rotated to the Right.");
        System.out.println("2. Rotated to the Left.");

        System.out.print("Enter your choice = ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {
            int count = findPivotDuplicates(arr) + 1;
            System.out.println("\nRotated to the Right Count = " + count);
        } else {
            int count = arr.length - (findPivotDuplicates(arr) + 1);
            System.out.println("\nRotated to the Left Count = " + count);
        }
    }

    static int findPivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;

            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
