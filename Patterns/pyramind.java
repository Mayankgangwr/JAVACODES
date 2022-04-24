public class pyramind {
    public static void main(String[] args) {
        int n = 5;
        System.out.println();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print row number Row number time
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
