package Conditions;
import java.util.Scanner;
//import java.util.Scanner;
public class For_Loop {
    public static void main(String[] args) {
        System.out.println("How many times you want to print it.");
        Scanner in= new Scanner(System.in);
        int times = in.nextInt();
        for(int i=1; i<times;i++){
            System.out.println("Hi Pd.");
        }
    }
}
