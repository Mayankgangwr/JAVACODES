public class Insorts {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printarr(int aa[]) {
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 6, 9, 8, 2, 7, 3 };
        insertionSort(a);
        printarr(a);
    }
}
