public class solidsquere {
    public static void main(String[] args) {
        int ni = 5;
        int nj = 5;
        for (int i = 1; i <= ni; i++) {
            for (int j = 1; j <= nj; j++) {
                if (i == 1 || j == 1 || j == nj || i == ni) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
