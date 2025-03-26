package L1;

//Sum of first N natural numbers
public class Sum_natural {

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }

    public static int Sum(int N){
        if(N==1){
            return 1;
        }

 return N + Sum(N-1);  }
}
