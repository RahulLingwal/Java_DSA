package Java04_Recursion.Backtracking;

import java.util.ArrayList;

public class MazeWithDiagonal {
    public static void main(String[] args) {
        ArrayList<String> ans = getPathsDiagonal("", 3, 3);
        System.out.println(ans);
    }
    
    static ArrayList<String> getPathsDiagonal(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(getPathsDiagonal(processed + 'D', row - 1, col));
        }

        if (row > 1 && col > 1) {
            list.addAll(getPathsDiagonal(processed + 'd', row - 1, col - 1));
        }

        if (col > 1) {
            list.addAll(getPathsDiagonal(processed + 'R', row, col - 1));
        }

        return list;
    }
}
