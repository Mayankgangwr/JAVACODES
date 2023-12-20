package Recursion;

public class NQueen {

    public static void printNQueens(int n) {
        int[] placement = new int[n];
        solveNQueens(0, n, placement);
    }

    private static void solveNQueens(int row, int n, int[] placement) {
        if (row == n) {
            // All queens are placed, print the solution.
            printSolution(placement);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, placement)) {
                placement[row] = col;
                solveNQueens(row + 1, n, placement);
            }
        }
    }

    private static boolean isSafe(int row, int col, int[] placement) {
        for (int i = 0; i < row; i++) {
            // Check if the new queen conflicts with any queen in the previous rows.
            if (placement[i] == col || Math.abs(placement[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printSolution(int[] placement) {
        int n = placement.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (placement[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 6; // You can change this value to the desired board size.
        printNQueens(n);
    }
}
