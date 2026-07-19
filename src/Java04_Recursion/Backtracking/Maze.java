package Java04_Recursion.Backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println("Possible number of paths the top-left corner to the bottom-right corner of a maze = " + countPaths(3, 3));
    }

    static int countPaths(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int right = countPaths(row, col - 1);
        int down = countPaths(row - 1, col);
        return right + down;
    }
}
