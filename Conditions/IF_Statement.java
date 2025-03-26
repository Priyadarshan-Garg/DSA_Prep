package Conditions;
import java.util.Scanner;


public class IF_Statement {
    ;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Salary:");
        int salary = input.nextInt();
        if (salary > 10000) {
            salary += 5000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

    }


}


