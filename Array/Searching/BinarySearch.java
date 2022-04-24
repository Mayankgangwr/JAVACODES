import java.util.*;

public class BinarySearch {
    static int Binarysearch(int arr[], int l, int r, int k) {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                return Binarysearch(arr, l, mid - 1, k);
            } else if (arr[mid] < k) {
                return Binarysearch(arr, mid + 1, r, k);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        int val = 7;
        int a[] = { 2, 3, 5, 7, 8, 11 };
        int l = 0;
        int size = a.length;
        int r = size - 1;
        System.out.print(Binarysearch(a, l, r, val));
    }
}
