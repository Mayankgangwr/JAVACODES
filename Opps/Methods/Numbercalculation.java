import java.util.Scanner;

public class Numbercalculation {
    public static int sum(int A, int B) {
        return A + B;
    }

    public static int sub(int A, int B) {
        return A - B;
    }

    public static int multi(int A, int B) {
        return A * B;
    }

    public static int divide(int A, int B) {

        return A / B;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b);
        int sub = sub(a, b);
        int multi = multi(a, b);
        int divide = divide(a, b);
        System.out.println("Sum of two Numbers: " + sum);
        System.out.println("Substraction of two Numbers: " + sub);
        System.out.println("Multiplication of two Numbers: " + multi);
        System.out.println("Division of two Numbers: " + divide);
    }
}
