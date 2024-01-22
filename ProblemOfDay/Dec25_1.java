package ProblemOfDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dec25_1 {

    private static Map<Integer, List<String>> cache = new HashMap<>();

    public static void main(String[] args) {
        String input = "2";
        List<String> decodings = numDecodings(input, 0);

        // Print all decodings
        for (String decoding : decodings) {
            System.out.println(decoding);
        }
    }

    private static List<String> numDecodings(String s, int startIndex) {
        if (cache.containsKey(startIndex)) {
            return cache.get(startIndex);
        }

        if (startIndex >= s.length()) {
            List<String> emptyList = new ArrayList<>();
            emptyList.add(""); // Empty string represents a valid decoding
            return emptyList;
        }

        if (s.charAt(startIndex) == '0') {
            cache.put(startIndex, new ArrayList<>());
            return new ArrayList<>();
        }

        List<String> decodeWays = new ArrayList<>();

        // Decode the substring starting from the next index
        List<String> nextDecodings = numDecodings(s, startIndex + 1);
        for (String decoding : nextDecodings) {
            decodeWays.add((char) ('A' + Integer.parseInt(s.substring(startIndex, startIndex + 1)) - 1) + decoding);
        }

        // Check if there are at least two characters remaining
        if (startIndex + 2 <= s.length()) {
            int num = Integer.parseInt(s.substring(startIndex, startIndex + 2));

            // If the two-character substring is a valid encoding
            if (num >= 10 && num <= 26) {
                // Decode the substring starting from the index after the two characters
                List<String> nextNextDecodings = numDecodings(s, startIndex + 2);
                for (String decoding : nextNextDecodings) {
                    decodeWays.add((char) ('A' + num - 1) + decoding);
                }
            }
        }

        cache.put(startIndex, decodeWays);
        return decodeWays;
    }
}
