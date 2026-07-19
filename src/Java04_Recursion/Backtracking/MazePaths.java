package Java04_Recursion.Backtracking;

import java.util.ArrayList;

public class MazePaths {
    public static void main(String[] args) {
        printpaths("", 3, 3);
        System.out.println();

        ArrayList<String> ans = getPaths("", 3, 3);
        System.out.println(ans);
    }

    static void printpaths(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1) {
            printpaths(processed + 'D', row - 1, col);
        }

        if (col > 1) {
            printpaths(processed + 'R', row, col - 1);
        }
    }

    static ArrayList<String> getPaths(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(getPaths(processed + 'D', row - 1, col));
        }

        if (col > 1) {
            list.addAll(getPaths(processed + 'R', row, col - 1));
        }

        return list;
    }
}
