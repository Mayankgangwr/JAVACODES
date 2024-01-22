package BitManipulation;

public class Dec29 {
    public static void main(String[] args) {//

        // divid by 2

        int a = 6;
        System.out.println(a>>1);

        // to check even od number
        int num1 = 4;   // Binary: 0101
        int num2 = 1;   // Binary: 0011
        int result = num1 & num2;
        System.out.println(result);

        // to swap two numbers
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println(num1+ ", "+num2);

        //Bit Masking
        
    }
}
