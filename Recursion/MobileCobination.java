package Recursion;

public class MobileCobination {
    private static String list[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void permutations(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        // Pass string after removing selected char to Skip duplicate combination
        for (int i = 0; i < str.length(); i++) {
            char currCahr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + i);
            permutations(newString, idx, combination + currCahr);
        }

        // Skip duplicate combination by condition check
        for (int i = 0; i < str.length(); i++) {
            if (combination.contains(str.substring(i, i + 1))) {
                permutations(str, idx + 1, combination + str.charAt(i));
            }

        }
    }

    public static void mobileCobination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        int currCahr = Integer.parseInt(str.substring(idx, idx + 1));
        String mapping = list[currCahr];

        for (int i = 0; i < mapping.length(); i++) {
            mobileCobination(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str, 0, "");

    }
}
