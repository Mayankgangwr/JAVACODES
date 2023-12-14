package Arrays;

public class RotateArr {
    /*
     * Rotate one by one
     * Time Complexity: O(N * d)
     * Auxiliary Space: O(1)
     */

    public static int[] rotateArrOneByOne(int arr[], int d, String dir) {
        int n = arr.length;
        int i = 0;
        while (i < d) {
            int last;
            if (dir == "Right") {
                last = arr[n - 1];
                for (int j = n - 1; j >= 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            } else {
                last = arr[0];

                for (int j = 0; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = last;
            }
            i++;
        }
        return arr;
    }

    /*
     * Rotate Using Temp Array
     * Time Complexity: O(N)
     * Auxiliary Space: O(N)
     */
    public static int[] rotateUsingTempArr(int arr[], int d, String dir) {
        int n = arr.length;
        int temp[] = new int[n];
        int i;
        if (dir == "Right") {
            i = 0;
            for (int j = 0; j < n - d; j++) {
                temp[j + d] = arr[j];
                i++;
            }
            for (int j = 0; j < d; j++) {
                temp[j] = arr[i];
                i++;
            }
        } else {
            i = n - 1;
            for (int j = 0; j < n - d; j++) {
                temp[j] = arr[j + d];
                i--;
            }
            for (int j = n - d; j < n; j++) {
                temp[j] = arr[i];
                i--;
            }
        }
        return temp;
    }

    /*
     * Reversal Algorithm
     * Time Complexity: O(N)
     * Auxiliary Space: O(1)
     */
    public static int[] rotateArrUsingReversalAlgo(int arr[], int d, String dir) {
        int n = arr.length;
        if (dir == "Right") {
            reveseArr(arr, 0, d - 1);
            reveseArr(arr, d, n - 1);
            reveseArr(arr, 0, n - 1);
        } else {
            reveseArr(arr, n - d, n - 1);
            reveseArr(arr, 0, n - d - 1);
            reveseArr(arr, 0, n - 1);
        }

        return arr;
    }

    public static int[] reveseArr(int arr[], int i, int j) {
        while (i < j) {
            SwapArr.swapArr(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int d = 2;
        String dir = "Rigt";
        // int newarr[] = rotateArrOneByOne(myArray, d, dir);
        int newarr[] = rotateUsingTempArr(myArray, d, dir);
        PrintArr.printArray(newarr);

    }
}
