package Recursion;

import java.util.HashSet;

public class StrSubSequance {
    private static HashSet<String> uniqueSubsequences = new HashSet<>();

    public static void subSequance(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currCahr = str.charAt(idx);

        subSequance(str, idx + 1, newString + currCahr);

        subSequance(str, idx + 1, newString);

    }

    public static void subSequanceForUnique(String str, int idx, String newString) {
        if (idx == str.length()) {
            uniqueSubsequences.add(newString);
            return;
        }
        char currChar = str.charAt(idx);

        subSequanceForUnique(str, idx + 1, newString + currChar);

        subSequanceForUnique(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "bbb";
        subSequanceForUnique(str, 0, "");
        for (String subsequence : uniqueSubsequences) {
            System.out.println(subsequence);
        }
    }
}
