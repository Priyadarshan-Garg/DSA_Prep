import java.util.Arrays;

public class String_to_char {
    public static void main(String[] args) {
        String name ="Priyadarshan Garg";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.strip());
    }
}
