package Leetcode;

public class Problem45 {
    public static int jump(int[] nums) {
        int count=0;
        int init = nums[0];
        for(int i=1; i<nums.length; i++){
            System.out.println("INIT :"+init+", Current :"+nums[i]);
            if(init<nums[i] || i==nums.length-1){
                System.out.println("INIT :"+init+", Current :"+nums[i]);
                
                init = nums[i];
                count++;
            }
            System.out.println("");
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums ={2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
