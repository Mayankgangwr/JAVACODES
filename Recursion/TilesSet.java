package Recursion;

import java.util.Scanner;

public class TilesSet {

    public static int place(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n<m) {
            return 1;
        }
        int h = place(n - 1, m);
        int v = place(n-m, m);
        return h + v;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("N : ");
            int n = sc.nextInt();
            System.out.println();
            System.out.print("M : ");
            int m = sc.nextInt();
            System.out.println(place(n, m));
        }
    }

}
