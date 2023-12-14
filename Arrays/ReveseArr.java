package Arrays;

public class ReveseArr {
    public static int[] reveseArr(int arr[]) {
        int i =0;
        int j = arr.length-1;
        while(i<j){
            SwapArr.swapArr(arr, i, j);
            i++;
            j--;
        }
        return arr; 
    }
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5 };
        int arr[] = reveseArr(myArray);
        PrintArr.printArray(arr);

    }
}
