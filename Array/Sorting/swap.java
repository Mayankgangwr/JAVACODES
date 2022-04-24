import java.util.*;

public class swap {
    static void swaping(int arr[], int r, int l) {
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 7, 6, 4, 9 };
        int i = 3;
        int j = 5;
        swaping(a, i, j);

    }
}
