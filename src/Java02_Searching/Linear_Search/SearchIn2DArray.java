package Java02_Searching.Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 1},
                {10, 12, 3, 11},
                {87, 98, 34, 50},
                {18, 12, 13}
        };

        int target = 98;

        int[] result = search(arr, target);

        if (!Arrays.equals(result, new int[]{-1, -1})) {
            System.out.println("Element found at index position = " + Arrays.toString(result));
        } else {
            System.out.println("Element not found.");
        }

    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
