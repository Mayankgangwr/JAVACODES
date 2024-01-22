package ProblemOfDay;

public class Dec24 {
    public static int minOperations1(String s) {
        int countForAlternate0 = 0;
        int countForAlternate1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    countForAlternate1++;
                } else {
                    countForAlternate0++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    countForAlternate1++;
                } else {
                    countForAlternate0++;
                }
            }
            System.out.println("countForAlternate1 :" + countForAlternate1);
            System.out.println("countForAlternate0 :" + countForAlternate0);
        }
        return Math.min(countForAlternate0, countForAlternate1);
    }

    public static int minOperations(String s) {
        int count = 0;
        char init = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (init == currChar) {
                count++;
                init = currChar == '0' ? '1' : '0';
            } else {
                init = currChar;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minOperations1("10010100"));
    }

}
