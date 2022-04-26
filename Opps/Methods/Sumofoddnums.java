import java.util.*;

//Range b/w 1 to n.
public class Sumofoddnums {
    static int sumofodd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i + 1) % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofodd(n));
    }

}
