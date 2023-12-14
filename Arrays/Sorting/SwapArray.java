package Arrays.Sorting;

public class SwapArray {
    public static int[] swap(int[] array, int i, int j) {
        if (i != j && i >= 0 && i < array.length && j >= 0 && j < array.length) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
