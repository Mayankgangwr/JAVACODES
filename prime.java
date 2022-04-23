import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, count;
        count = 0;
        num = s.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(num + " Is not Prime");
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println(num + " Is  Prime");
    }

}
