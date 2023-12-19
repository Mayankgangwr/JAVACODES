package Recursion;

import java.util.HashSet;

public class RemoveDuplicateChar {
    public static boolean[] map = new boolean[26];
   //Logic by Apna College
    public static String removeDuplicates1(String str, int idx, String newStr) {
        if (idx == str.length()) {
            return newStr;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == false) {
            newStr = newStr + currChar;
            map[currChar - 'a'] = true;
        }
        return removeDuplicates1(str, idx + 1, newStr);
    }

    // Login by me
    public static String removeDuplicates(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abacabad";
        String result = removeDuplicates1(input, 0, "");

        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + result);
    }
}
