public class diamond {
    public static void main(String[] args) {
        int n = 4;
        System.out.println();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        // second half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
