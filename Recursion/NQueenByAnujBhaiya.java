package Recursion;

import java.util.Scanner;

public class NQueenByAnujBhaiya {
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

    private static void printNQueens(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Q') {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print(". ");
                }

            }
            System.out.println("");
        }
    }

    public static boolean nqueenByAnujBhaiya(char[][] board, int n, int row) {
        if (row == n) {
            printNQueens(board);
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if (nqueenByAnujBhaiya(board, n, row + 1)) {
                    return true;
                } else {
                    board[row][col] = ' ';
                }
            } else {
                board[row][col] = ' ';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Value of N : ");
            int n = sc.nextInt();
            char[][] board = new char[n][n];
            nqueenByAnujBhaiya(board, n, 0);
        }

    }
}
