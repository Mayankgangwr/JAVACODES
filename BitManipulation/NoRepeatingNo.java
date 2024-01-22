package BitManipulation;

import java.util.HashMap;

public class NoRepeatingNo {
    public static void findOne(int arr[]) {
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs = rs ^ arr[i];
        }
        System.out.println(rs);
    }

    public static void findMultiple(int[] arr) {
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs = rs ^ arr[i];
        }
        int ans1 = rs;
        int ans2 = rs;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 1) {
                ans1 ^= arr[i];
            }

        }
        // Print the non-repeating elements
        System.out.println("Non-repeating elements are: " + ans1 + " and " + (ans1^ans2));
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 4, 1, 4, 3, 5, 1};
        findMultiple(arr);
        HashMap<Integer, Integer> subsets = new HashMap<>();
        subsets.get(subsets)
        subsets.put(null, null)
        subsets.replace(null, null)
        subsets.get(subsets)    
        subsets.containsKey(subsets)    
    }
}
