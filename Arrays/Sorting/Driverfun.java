package Arrays.Sorting;

import java.util.Arrays;


public class Driverfun {
 public static void main(String[] args) {
        int[] arrayToSort = {4, 2, 9, 1, 5, 6};
        // Using SwapUtils to swap elements
        int arr[] = Insertion.sortFn(arrayToSort);
        // Print the array after swapping
        System.out.println(Arrays.toString(arr));
    }   
}
