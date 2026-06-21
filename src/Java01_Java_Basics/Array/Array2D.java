package Java01_Java_Basics.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = {
                {11, 12},
                {20, 21},
                {30, 31, 33}
        };
        
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println(arr[0][1]);
        System.out.println();

        // Input 2D Array
        int[][] arr2 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + "[" + (i + 1) + "]" + " [" + (j + 1) + "]" + "element = ");
                arr2[i][j] = input.nextInt();
            }
        }

        for (int[] row : arr2) {
            for (int element : row) {
                System.out.print(element + "      ");
            }
            System.out.println();
        }
    }
}
