package Java04_Recursion.Backtracking;

import java.util.Arrays;

public class MazePathVisualizer {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[maze.length][maze[0].length];

        printPathsWithSteps("", maze, 0, 0, path, 1);
    }

    static void printPathsWithSteps(String processed, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("Path = " + processed);
            System.out.println();
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            printPathsWithSteps(processed + 'D', maze, row + 1, col, path, step + 1);
        }

        if (col < maze[0].length - 1) {
            printPathsWithSteps(processed + 'R', maze, row, col + 1, path, step + 1);
        }

        if (row > 0) {
            printPathsWithSteps(processed + 'U', maze, row - 1, col, path, step + 1);
        }

        if (col > 0) {
            printPathsWithSteps(processed + 'L', maze, row, col - 1, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
