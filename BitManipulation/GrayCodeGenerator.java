package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class GrayCodeGenerator {

    public static List<Integer> generateGrayCode(int n) {
        List<Integer> grayCode = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            System.out.println("(i>>1) => "+(i>>1)+", i ^ (i >> 1) => "+(i ^ (i >> 1)));
            grayCode.add(i ^ (i >> 1));
        }

        return grayCode;
    }

    public static void main(String[] args) {
        int n = 3;
        List<Integer> result = generateGrayCode(n);
        System.out.println(result);
    }
}

