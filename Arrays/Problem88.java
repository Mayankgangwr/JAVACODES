package Arrays;

public class Problem88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // index of last element in nums1
        int j = n - 1; // index of last element in nums2
        int k = m + n - 1; // index of last position in merged nums1 array

        // Merge from the end to the beginning
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {  
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];m, m ,mmn
        }

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3, n = 3;
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, m, nums2, n);
    }

}
y  