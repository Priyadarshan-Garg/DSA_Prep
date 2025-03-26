public class Factorial {
    public static void main(String[] args) {
//        System.out.println(fact(5));
        System.out.println(fact2(5,1));
    } static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    static int fact2(int num ,int product){
        if(num<=1){
            return product;
        }
        return fact2(num-1,product*num);
    }

}
