package Recursion;

public class MoveCharAtEnd {

    public static String moveXToEnd(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char firstChar = str.charAt(0);

        if (firstChar == 'x') {
            // If the first character is 'x', append it to the end and recurse on the rest
            // of the string
            return moveXToEnd(str.substring(1)) + firstChar;
        } else {
            // If the first character is not 'x', keep it at the beginning and recurse on
            // the rest of the string
            return firstChar + moveXToEnd(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String input1 = "xaxbxc";
        System.out.println("Result : " + moveXToEnd(input1));
    }
}
