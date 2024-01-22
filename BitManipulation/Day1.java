package BitManipulation;

public class Day1 {
    
    static void bin(int n) {
        if (n > 1) {
            bin(n / 2);
        }
        System.out.print(n % 2);
    }

    static void bin1(Integer n)
    {
        if (n > 1){
            bin1(n >> 1);
        }
        System.out.printf("%d", n & 1);
    }

    public static void main(String[] args) {
      //  bin1(7);
        System.out.println(7&1);
       // bin(4);
    }
}
