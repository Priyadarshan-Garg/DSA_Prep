package Conditions;

import java.util.Scanner;

public class Nested_Switch
{
    public static void main(String[] args) {
        System.out.println("Please Enter a number to get I'd or department");
        Scanner in = new Scanner(System.in);
       int Emp = in.nextInt();
        String Department = in.next();
        switch (Emp){
            case 1-> System.out.println("The Employee is PD");
            case 2-> System.out.println("The Employee is Rajat");
            case 3-> System.out.println(switch (Department) {
                case "IT" -> "This department is IT";
                case "CS" -> "This Department is CS";
                default -> "There aint no other Department";
            });
            default -> System.out.println("No other Employee");
        }
    }
}
