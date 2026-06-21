package Java02_Searching.Binary_Search;

import java.util.Arrays;

public class RowColSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 50;

        int[] result = binarySearch2D(matrix, target);

        if (!Arrays.equals(result, new int[]{-1, -1})) {
            System.out.println("Element found at index position = " + Arrays.toString(result));
        } else {
            System.out.println("Element not found.");
        }

    }

    static int[] binarySearch2D(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) return new int[]{row, col};

            if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

}
