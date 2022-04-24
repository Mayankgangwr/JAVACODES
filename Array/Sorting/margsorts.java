public class margsorts {
    public static void Sorts(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int r = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[r] > arr[j]) {
                    r = j;
                    System.out.print(r + " ");
                }
            }
            System.out.println();
            swaping(arr, i, r);
            printarr(arr);
        }
    }

    static void swaping(int arr[], int r, int l) {
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        // System.out.println(Arrays.toString(arr));
    }

    static void printarr(int aa[]) {
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, 6, 9, 8, 2, 7, 3 };
        Sorts(a);
        printarr(a);
    }

}