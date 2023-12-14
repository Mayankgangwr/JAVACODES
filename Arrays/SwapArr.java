package Arrays;

public class SwapArr {
    public static int[] swapArr(int arr[], int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return arr;
    }
}
