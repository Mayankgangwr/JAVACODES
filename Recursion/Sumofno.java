package Recursion;

public class Sumofno {
    public static void sumOfNo(int n, int sum) {
        if (n == 0) {
            sum = sum + n;
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sumOfNo(n - 1, sum);
    }

    public static void main(String[] args) {
        sumOfNo(5, 0);
    }

}
