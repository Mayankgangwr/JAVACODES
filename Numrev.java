public class Numrev {
    public static void main(String[] args) {
        int a = 298398244;
        int n =a;
           int revnum = 0;
        while(a>0){
            int rem = a%10;
            a = a/10;
            revnum = revnum*10 + rem;
        }
        if(n==revnum)
        System.out.print(revnum+" Is Same Num");
        else
        System.out.print(revnum+" Not Is Same Num");     
    
    }
}