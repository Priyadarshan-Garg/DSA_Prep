import java.io.File;

public class ReverseSubstringsBetweenEachPairofParentheses {
    public static StringBuilder Function(String s){
        char c = s.charAt(0);
        StringBuilder X = new StringBuilder();
        if(s.isEmpty()) return X;
        if (c == '(') {
            X = new StringBuilder();
            X = Function(s.substring(1));

        }
        if(c==')'){
            X.reverse();
            Function(s.substring(1));
        }
        X.append(c);
 return X;   }

    public static void main(String[] args) {


    }
}
