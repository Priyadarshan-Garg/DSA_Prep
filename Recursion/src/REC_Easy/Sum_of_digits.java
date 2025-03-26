package REC_Easy;

public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println( Prod(12345));
    }
    static int Sum(int n){
        if(n<10 && n>=0){
            return n;
        }
//        int add = n%10;
        return n%10 + Sum(n/10);
    }
    static int Prod(int n){
        if(n%10==n){
            return n;
        }
//        int add = n%10;
        return n%10 * Prod(n/10);
    }
}
