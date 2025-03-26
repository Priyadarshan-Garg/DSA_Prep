import java.util.Scanner;
import java.util.SortedMap;

public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num whether its Armstrong or not");
        int n =in.nextInt();
        Arm(n);
    }
    static void Arm(int a){
        int original = a;
        int cube = 0;
        while (a>0){
            int rem = a%10;

            a=a/10;
            cube=cube+((rem)*(rem)*(rem));


        }if (original==cube){
            System.out.println("This is armstrong Num");
        } else{
            System.out.println("its not");
        }
//    return cube;
}
}
