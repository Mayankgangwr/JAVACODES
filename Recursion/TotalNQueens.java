package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalNQueens {

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> solutions = new ArrayList<>();
        nqueen(board, n, 0, solutions);
        return solutions;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static void nqueen(char[][] board, int n, int row, List<List<String>> solutions) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder rowString = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    rowString.append(board[i][j] == 'Q' ? 'Q' : '.');
                }
                solution.add(rowString.toString());
            }
            solutions.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nqueen(board, n, row + 1, solutions);
                board[row][col] = ' '; // Backtrack
            }
        }
    }

    public static int totalNQueens(int n) {
        char[][] board = new char[n][n];
        return countNQueens(board, n, 0);
    }

    private static int countNQueens(char[][] board, int n, int row) {
        if (row == n) {
            return 1; // Found a solution
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                count += countNQueens(board, n, row + 1);
                board[row][col] = ' '; // Backtrack
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Value of N: ");
            int n = sc.nextInt();

            // Count and print the total number of solutions
            int totalSolutions = totalNQueens(n);
            System.out.println("Total Number of Solutions: " + totalSolutions);
        }
    }
}
