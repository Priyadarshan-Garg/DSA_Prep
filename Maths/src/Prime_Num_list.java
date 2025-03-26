public class Prime_Num_list {
    public static void main(String[] args) {
        int n =40;
//        for (int i = 1; i <n; i++) {
//            if (Check_prime(i)) {
//                System.out.println(i);
//            }
//        }
        boolean [] p = new boolean[n+1];
        seive(n,p);

    }
//    static boolean Check_prime(int n){
//        if (n <=1) {
//            return false;
//        }
//        for (int i = 2; i < Math.sqrt(n) ; i++) {
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
    // not so efficient
    static void seive(int n , boolean [] prime){
        for (int i = 2; i *i<n ; i++) {
            if (!prime[i]) {
                for (int j = i*2; j <=n ; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!prime[i]){
                System.out.println(i + " ");
            }
        }
    }

}
