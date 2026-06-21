package Java02_Searching.Linear_Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 6, 4, 5, 9, 20, 15, 1, 8};
        int target = 9;

        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.printf("Element found at index = %d ", index);
        } else {
            System.out.println("Element not found.");
        }

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
}
