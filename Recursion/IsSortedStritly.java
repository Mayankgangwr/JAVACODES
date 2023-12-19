package Recursion;

public class IsSortedStritly {

    public static boolean isSortedStritly(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1] || arr[idx] == arr[idx + 1]) {
            return false;
        }
        return isSortedStritly(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4 };
        System.out.println(isSortedStritly(arr, 0));
    }
}
