package Conditions;

public class Reverse_Num {
    public static void main(String[] args) {
        int n =13;
        int Rev = 0;
        while(n>0){
        int rem = n%10;
        n=n/10;
    Rev= Rev*10 + rem;
          //
        }
        System.out.println(Rev);

    }
}
