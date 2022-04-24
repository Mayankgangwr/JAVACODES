public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        System.out.println();
        // first half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++) {
            // Second half
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 2 * n; j > 2 * (n - i + 1); j--) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
