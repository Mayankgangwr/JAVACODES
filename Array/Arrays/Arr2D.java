package Arrays;

/*
       j   j   j   j
       0   1   2   3
  i 0 0,0 0,1 0,2 0,3
  i 1 1,0 1,1 1,2 1,3
  i 2 2,0 2,1 2,2 2,3

       j   j   j   j
       0   1   2   3
  i 0  1   2   3   4
  i 1  5   6   7   8
  i 2  9   10  11  12
  */
public class Arr2D {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

}
