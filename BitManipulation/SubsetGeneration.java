package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SubsetGeneration {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // The total number of subsets is 2^n
        int totalSubsets = 1 << n;
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            // Check each bit in the bitmask
            for (int j = 0; j < n; j++) {
                // If the jth bit is set, add nums[j] to the subset
                System.out.println("i => "+i+", (1 << j) => "+(1 << j)+", (i & (1 << j)) => "+(i & (1 << j)));
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            System.out.println(subset);
            result.add(subset);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);

        // Print the result
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

