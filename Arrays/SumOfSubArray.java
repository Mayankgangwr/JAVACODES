package Arrays;

import java.util.HashMap;

public class SumOfSubArray {
    public static void sumOfSubArray(int[] arr, int sum){
        int currSum = 0;
        int start =0;
        int end =-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            currSum +=arr[i];
            if(currSum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currSum-sum)){
                start = map.get(currSum-sum)+1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if(end==-1){
            System.out.println("Not Found");
        }else{
            System.out.println(start+" to "+end);
        }

    }
    public static void main(String[] args) {
        int arr[] = {10,15,-5, 10,15,-10,-5,15};
        int sum =5;
        sumOfSubArray(arr, sum);
    }
}
