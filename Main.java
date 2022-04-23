class Main {

    public static void main(String[] args) {
        long k = 8;
        long mn = 10;
        long mx = -1;
        while (k != 0) {
            long r = k % 10;
            long b = mx;
            System.out.println(r);
            System.out.println(b);
            mx = Math.max(b, r);
            mn = Math.min(mn, k % 10);
            k = k / 10;
        }
        System.out.println(mx);
        System.out.println(mn);

    }
}