public class Arrsumatlast {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int j = n;
        for (int i = n - 1; i >= 0; i--) {
            if (j < n) {
                arr[i] = arr[i] + arr[j];
            }
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
