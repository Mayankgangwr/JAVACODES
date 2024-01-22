package ProblemOfDay;

import java.util.HashMap;
import java.util.Map;

public class Dec25 {
    private static Map<Integer, Integer> cache; // index-> decode ways
    
    public static int numDecodings(String s) {
        cache = new HashMap();
        return backtracing(s, 0);
    }

    private static int backtracing(String s, int startIndex) {
        if (cache.containsKey(startIndex)) {
            return cache.get(startIndex);
        }
        if (startIndex >= s.length()) {
            return 1;
        }
        if (s.charAt(startIndex) == '0') {
            cache.put(startIndex, 0);
            return 0;
        }
        int decodeWays = backtracing(s, startIndex + 1);
        if (startIndex + 2 <= s.length()) {
            int num = Integer.parseInt(s.substring(startIndex, startIndex + 2));
            if (num <= 26) {
                decodeWays += backtracing(s, startIndex + 2);
            }
        }
        cache.put(startIndex, decodeWays);
        return decodeWays;
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("2623034"));
    }

    
}
