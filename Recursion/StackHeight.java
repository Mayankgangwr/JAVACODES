package Recursion;

public class StackHeight {

    public static int xpown(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return xpown(x, n / 2) * xpown(x, n / 2);
        } else {
            return xpown(x, n / 2) * xpown(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int x = 2;
        System.out.println(xpown(x, n));
    }

}
