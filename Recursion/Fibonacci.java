package Recursion;

public class Fibonacci {

    public static void fibonacci(int a, int b, int n){
            if(n==1){
                System.out.println(a+b);
                return;
            }
            System.out.print(a+b+", ");
            fibonacci(b, a+b, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+", "+b+", ");
        fibonacci(a, b, 8);

    }
    
}
