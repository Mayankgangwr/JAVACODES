import java.util.*;

public class Printaverage {
    static float ave(int a, int b, int c) {
        float average = (float) (a + b + c) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(ave(a, b, c));
    }
}
