package Recursion;

public class StudentArrangePermutation {

    public static void possiblePermutation(String str, String perm, int idx) {
        if (str.length()==0) {
            System.out.println("Possible Permutations: " + perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            possiblePermutation(newStr, perm + currChar, idx + 1);
        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        possiblePermutation(str, "", 0);
    }

}
