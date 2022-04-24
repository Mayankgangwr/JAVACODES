public class Sortbinaryarr {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 0, 1 };
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n; i++) {

            if (arr[i] < 1) {
                j++;
                System.out.println(j);
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }
}
