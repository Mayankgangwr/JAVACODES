package Recursion;

public class PeopleArrange {

    public static int peopleArrange(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways1 = peopleArrange(n - 1);

        int ways2 = (n - 1) * peopleArrange(n - 2);

        return ways1 + ways2;
    }
    
    public static void main(String[] args) {
        System.out.println(peopleArrange(4));
    }
}
