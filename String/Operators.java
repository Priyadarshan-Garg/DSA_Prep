import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        // this will convert into integer wrapper class which will call toString then its eventually "a" + "1"
        System.out.println("PD" + new  ArrayList<>());
//        complex object + complex Object error dega but agar usmee atleast ek string aa jaye to kaam ban jayega
        String ans = new ArrayList<>() + "" + new Integer(76); // yaha "" --> string tha
        System.out.println(ans);
    }
}
