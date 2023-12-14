package Recursion;

public class Factorial {
    public static void factorial(int n, int result) {
        if (n == 0) {
            System.out.println(result);
            return;
        }
        result = result * n;
        factorial(n - 1, result);
    }

    public static int calFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm = calFactorial(n-1);
        int fact_n = n*fact_nm;
        return fact_n; 
    }
    public static void main(String[] args) {
        //factorial(3, 1);
        int ans =calFactorial(3);
        System.out.println(ans);
    }
}
