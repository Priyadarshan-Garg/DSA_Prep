package Conditions;

import javax.swing.text.Style;


import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter The Fruit You Like");
      String Fruit = in.nextLine();
//        switch (Fruit) {
//            case "Mango":
//                System.out.println("King OF Fruits");
//                break;
//            case "Apple":
//                System.out.println("Red fruit");
//                break;
//            default:
//                System.out.println("There ain't a great fruit");
//                break;

               // OLD STYLE ACHHA NAHI HAI

            switch (Fruit) {
                case "Mango" -> System.out.println("King OF Fruits");
                case "Apple" -> System.out.println("Red fruit");
                default -> System.out.println("There ain't a great fruit");


                //FALTU KI JHANJAT KHATAM OR BRAK CONDITION KI BHI JARURAT NAHI
            }
    }
}
