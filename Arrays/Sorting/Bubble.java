package Arrays.Sorting;

public class Bubble {
    public static int[] sortFn(int arr[]){
        for(int i=0; i<arr.length; i++){
         for(int j=0; j<arr.length-1; j++) {
            if(arr[j]>arr[j+1]){
             SwapArray.swap(arr, j, j+1);
            }
         }

        }
            return arr;
    }
}
