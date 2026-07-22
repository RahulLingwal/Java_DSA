package Java04_Recursion.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            printBoard(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    static boolean solve(int[][] board) {
        int boardSize = board.length;
        int row = -1;
        int col = -1;

        // Let's assume Sudoku has no empty cell
        boolean boardComplete = true;

        // Search for empty cell
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    boardComplete = false;
                    break;
                }
            }

            if (!boardComplete) {
                break;
            }
        }

        if (boardComplete) {
            // Sudoku is solved
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if (canPlaceNumber(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    private static boolean canPlaceNumber(int[][] board, int row, int col, int num) {
        //check in row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        //check in column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        int subgridSize = (int) (Math.sqrt(board.length));
        int rowStart = row - row % subgridSize;
        int colStart = col - col % subgridSize;

        // check in subgrid (3*3)
        for (int r = rowStart; r < rowStart + subgridSize; r++) {
            for (int c = colStart; c < colStart + subgridSize; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
