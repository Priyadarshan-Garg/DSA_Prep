package REC_Easy;

public class Steps {
    public static void main(String[] args) {
        System.out.println(k(8));
    } static int helper(int n , int c){
        if(n==0){
            return c;
        } else if(n%2==0){
            helper(n/2,c+1);
        }
        return helper(n-1,c+1); }
    static int k (int n){
        return helper(n,0);
    }
}
