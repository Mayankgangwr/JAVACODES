package Arrays.Sorting;

public class Selection {
    public static int[] sortFn(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            SwapArray.swap(arr, i, min);
        }
        return arr;
    }
}
