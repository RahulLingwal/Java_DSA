package Java02_Searching.Binary_Search;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 8;
        int[] result = search(matrix, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] search(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = (m * n) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / n;
            int col = mid % n;

            if (target == matrix[row][col]) return new int[]{row, col};

            if (target > matrix[row][col]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
