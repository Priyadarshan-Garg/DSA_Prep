import java.util.Arrays;

public class Var_args {

    public static void main(String[] args) {
//FUN(...v:1, 23, 45, 65, 2, 4, 657);

Sukuna(2,3, "Priyadarshan","Ajay");
    }static void FUN(int...v){
        System.out.println(Arrays.toString(v));
    }
static void Sukuna(int a, int b, String...v){
    System.out.println(Arrays.toString(v));
}
}