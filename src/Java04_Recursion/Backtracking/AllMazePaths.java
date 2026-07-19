package Java04_Recursion.Backtracking;

public class AllMazePaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        printAllPaths("", maze, 0, 0);
    }

    static void printAllPaths(String processed, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if (row < maze.length - 1) {
            printAllPaths(processed + 'D', maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            printAllPaths(processed + 'R', maze, row, col + 1);
        }

        if (row > 0) {
            printAllPaths(processed + 'U', maze, row - 1, col);
        }

        if (col > 0) {
            printAllPaths(processed + 'L', maze, row, col - 1);
        }

        maze[row][col] = true;
    }
}
