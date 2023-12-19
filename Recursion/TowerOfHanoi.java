package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("Disk " + n + "Transfer " + s + " To " + d);
            return;
        }
        towerOfHanoi(n - 1, s, d, h);
        System.out.println("Disk " + n + "Transfer " + s + " To " + d);
        towerOfHanoi(n - 1, h, s, d);

    }

    public static void main(String[] args) {
        try (Scanner sn = new Scanner(System.in)) {
            int n = sn.nextInt();
            towerOfHanoi(n, "S", "H", "D");
        }
    }

}
