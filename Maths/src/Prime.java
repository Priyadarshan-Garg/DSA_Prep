public class Prime {
    public static void main(String[] args) {
        System.out.println(Check_prime(13));
    } static boolean Check_prime(int n){
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
   return true;
    }
}