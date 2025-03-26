import java.util.Scanner;

public class Sum

        {
    public static void main(String[] args) {
       int ans = Sum();
        System.out.println(ans);
    }static int Sum(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter The Number1:");
            int num1 = in.nextInt();
            System.out.println("Enter The Number2:");
            int num2 = in.nextInt();
            int sum = num1+num2;
//            System.out.println("The sum is: " +sum);
            // SAME KAAM YE RETURN BHI KRTA HAI par hame uske liye
            // int use krna hoga instead of void kyuki void kuch nikarta
            return sum;

        }
}
