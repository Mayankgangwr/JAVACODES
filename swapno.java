public class swapno {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        System.out.println("Before Swaping");
        System.out.println("a = " + a + " & b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swaping");
        System.out.println("a = " + a + " & b = " + b);
    }

}
