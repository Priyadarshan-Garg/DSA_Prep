import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
        int n =20;
        Factor3(n);

    } static void Factor1(int n){
        for (int i = 1; i <n+1 ; i++) {
            if (n%i==0) {
                System.out.println(i);
            }

        }
    }
    // time:  O(n)


//    static void Factor2(int n){
//        for (int i = 1; i <=Math.sqrt(n) ; i++) {
//            if (n%i==0) {
//                if(n/i==i){
//                    System.out.print(i);
//                }
//                else{
//                    System.out.print(i +" "+ n/i + " ");
//
//                }
//            }
//
//        }
//    }
    // time : O(sqrt(n))




    static void Factor3(int n){
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0) {
                if(n/i==i){
                    System.out.print(i);
                }
                else{
                    System.out.print(i +" ");
                    list.add(n/i);
                }
            }

        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }

}
