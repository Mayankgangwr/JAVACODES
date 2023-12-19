package Recursion;

public class FLOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void floccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("first : " + first + " last : " + last);
            return;
        }
        if (element == str.charAt(idx)) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        floccurance(str, idx + 1, 'a');
    }

    public static void main(String[] args) {
        String str = "abcdabcabaadfffadd";
        floccurance(str, 0, 'a');
    }

}
