package REC_Easy;

public class Num_of_zero {
    static int zeros(int n ){
       return helper(n,0);
     }
     static int helper(int n, int count){
        int rem = n%10;
        if(n==0){
            return count;
        }
        if(rem==0){
           return helper(n/10,count+1);
        }
    return  helper(n/10,count);}
    public static void main(String[] args) {
        System.out.println(zeros(10023));
    }
}
