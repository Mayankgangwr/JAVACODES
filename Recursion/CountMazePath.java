package Recursion;

import java.util.Scanner;

public class CountMazePath {

    public static int mazePath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downpath = mazePath(i + 1, j, n, m);
        int rightpath = mazePath(i, j + 1, n, m);
        return downpath + rightpath;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("N : ");
            int n = sc.nextInt();
            System.out.println();
            System.out.print("M : ");
            int m = sc.nextInt();
            System.out.println(mazePath(0, 0, n, m));
        }
    }

}
