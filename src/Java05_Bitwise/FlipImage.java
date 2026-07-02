package Java05_Bitwise;
// https://leetcode.com/problems/flipping-an-image

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        for (int[] row : image) {
            System.out.print(Arrays.toString(row) + "\n");
        }
        System.out.println();

        flipAndInvertImage(image);
        for (int[] row : image) {
            System.out.print(Arrays.toString(row) + "\n");
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return image;
    }
}
