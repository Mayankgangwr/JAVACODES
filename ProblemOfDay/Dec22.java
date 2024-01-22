package ProblemOfDay;

public class Dec22 {
    public static int no_of_ones(String s)
    {
        int one_count = 0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            one_count++;
        }
        return one_count;
    }

    public static int maxScore(String s) {
        if(s.length()<=1)
        return s.length();
         
        int zeros = (s.charAt(0)=='0'?1:0);
        int ones = no_of_ones(s);
        int res = zeros+ones;
    //    System.out.println(zeros+ones);
        for(int i=1;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            zeros++;
            else
            ones--;
        //    System.out.println(zeros+ones);
            if(zeros+ones>res)
            res=zeros+ones;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }
}
