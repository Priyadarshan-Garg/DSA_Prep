public class BS_Sqrt {
    public static void main(String[] args) {
        System.out.println(Sqrt(40));
    } static double Sqrt (int n ){
        int s = 0;
         int e = n;
         while (s<=e){
            int m = s+(e-s)/2;
            if(m*m==n){
                return m;
            } if(m*m>n){
                e=m-1;
             } else {
                s= m+1;
             }
         }
         double inc = 0.1;
//        for (int i = 0; i <p ; i++) {
//            while (i*i<= n){
//
//            }
//        }
  return 0;  }
}
