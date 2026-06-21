package Java02_Searching.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-12, -5, 10, 20, 26, 30, 40, 44, 52, 68, 77, 80, 90, 99, 100};
        int[] arr2 = {100, 99, 90, 80, 77, 68, 52, 44, 40, 30, 26, 20, 10, -5, -10};
        int target = -10;

        int result = binarySearch(arr2, target);

        if (result != -1) {
            System.out.printf("Element found at index = %d", result);
        } else {
            System.out.println("Element not found.");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

