public class rightnumhalftry {
    public static void main(String[] args) {
        int n = 5;

        /*
         * numtry dicreamental way
         * 5 4 3 2 1
         * 4 3 2 1
         * 3 2 1
         * 2 1
         * 1
         */
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * numtry dicreamental way
         * 5 4 3 2 1
         * 5 4 3 2
         * 5 4 3
         * 5 4
         * 5
         */
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i + 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * numtry increamental way
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
         * numtry increamental way
         * 1 2 3 4 5
         * 2 3 4 5
         * 3 4 5
         * 4 5
         * 5
         */
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
