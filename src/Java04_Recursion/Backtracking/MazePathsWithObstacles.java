package Java04_Recursion.Backtracking;

import java.util.ArrayList;

public class MazePathsWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        ArrayList<String> ans = getPaths("", maze, 0, 0);
        System.out.println(ans);
    }

    static ArrayList<String> getPaths(String processed, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        if (!maze[row][col]) {
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        if (row < maze.length - 1) {
            list.addAll(getPaths(processed + 'D', maze, row + 1, col));
        }

        if (col < maze[0].length - 1) {
            list.addAll(getPaths(processed + 'R', maze, row, col + 1));
        }

        return list;
    }
}
