import java.util.*;

public class LinearSearch {
    static int Linearsearch(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = 7;
        int a[] = { 2, 3, 5, 7, 6, 4 };
        System.out.print(Linearsearch(a, val));
    }
}
