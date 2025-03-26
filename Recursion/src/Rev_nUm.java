public class Rev_nUm {
    public static void main(String[] args) {
//        System.out.println(rev(1543));
    rev(123);
        System.out.println(sum);
    }
    static  int sum =0;
    static void rev(int n){
        if(n%10==0){
            return ;
        }
        int rem  = n%10;
        sum = (sum*10)+rem;
        rev(n/10);
    }
}
