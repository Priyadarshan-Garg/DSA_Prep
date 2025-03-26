import java.util.Scanner;

public class Retry_armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int Original = a;
        int x =0;
        while(a>0){
//            int x = 0;
            int rem = a%10;
            x=x+(rem*rem*rem);
            a/= 10;
//            System.out.println(a);
//            System.out.println(Original);

        }
        if(Original==x){
            System.out.println("yes");

        }else {
            System.out.println("No");
        }

    }
}
