package Conditions;

import java.util.Scanner;

public class Largest_of_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The # numbers in order to find the Greatest");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        if (a>b && a>c){
//            System.out.println(a);
//        } else if (b>c && b>a) {
//            System.out.println(b);
//
//
//        } else if(c>a && c>b){
//            System.out.println(c);
//    }
//        else{
//            System.out.println("The 3 numbers arent distinct");

//        ANOTHER WAY HAI ISKO KARNE KA

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
}}
