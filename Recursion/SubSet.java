package Recursion;

import java.util.ArrayList;

public class SubSet {
     public static int possibleSubSet(int n, ArrayList<Integer> subSet) {
        if (n == 0) {
            return 1;
        }

        // Add subset
        subSet.add(n);
        int nm = possibleSubSet(n - 1, subSet);

        // Remove hoga
        subSet.remove(subSet.size() - 1);
        int mm = possibleSubSet(n - 1, subSet);
        return nm + mm;
    }


    public static void findSubSet(int n, ArrayList<Integer> subSet) {
        if (n == 0) {
            for (int i = 0; i < subSet.size(); i++) {
                System.out.print(subSet.get(i) + " ");
            }
            System.out.println("");
            return;
        }

        // Add subset
        subSet.add(n);
        findSubSet(n - 1, subSet);

        //Remove hoga
        subSet.remove(subSet.size() - 1);
        findSubSet(n - 1, subSet);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubSet(n, subSet);
    }
}
