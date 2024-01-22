package Interview150;

public class Problem {
    public static int removeDuplicates(int[] arr) {
        int count=1;
        for(int l=0; l<arr.length; l++){
            if(arr[l]==arr[l-1]){
               
            }else{
               
            } 
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3 };
        int rs = removeDuplicates(arr);
        System.out.println(rs);
    }
}
