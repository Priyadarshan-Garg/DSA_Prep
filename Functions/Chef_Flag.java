//import java.util.Scanner;
//
//class Chef_Flag {
//    public static void main(String[] args) throws java.lang.Exception {
//        Scanner in = new Scanner(System.in);
//        int testcase = in.nextInt();  // Number of test cases
//
//        // Loop through each test case
//        for (int i = 0; i < testcase; i++) {
//            int o = in.nextInt();  // Read o
//            int g = in.nextInt();  // Read g
//            int w = in.nextInt();  // Read w
//
//            // Check the condition
//            if (w + o >= (g - 1) && g + w >= (o - 1) && o + g >= (w - 1)) {
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
//        }
//    }
//}



import java.util.Scanner;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        for(int i=0; i< testcase; i++){

            int o =in.nextInt();
            int g =in.nextInt();
            int w =in.nextInt();
            if(w+o>=(g-1) && g+w>=(o-1) && o+g>=(w-1)){
                System.out.println("yes");}
            else{
                System.out.println("no");
            }

        }
    }
}


