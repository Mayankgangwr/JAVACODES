package Recursion;

public class Printno {

    public static int printNumber(int n) {
        if (n > 1) {
            System.out.println(printNumber(n - 1));
        }
        return n;

    }

    public static void main(String[] args) {
        System.out.println(printNumber(10));
    }

}
