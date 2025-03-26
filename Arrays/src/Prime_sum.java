public class Prime_sum {
    static boolean checkprime(int n ){
        if(n==1 || n==0){
            return false;
        }

        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        System.out.println(checkprime(103));
        int n = 7 ;
        for(int i = 1 ; i<=Math.sqrt(n) ; i++){
            for(int j = 1; j<=Math.sqrt(n) ; j++){
                if(checkprime(i) == true && checkprime(j) == true){
                    n = i+j;
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(n);
                }
            }

        }
    }


}
