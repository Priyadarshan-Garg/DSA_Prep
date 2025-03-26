public class RemoveOutermostParentheses {
    public static String Function(String s){
        String [] parts = s.split("()");
        String J ="";
        for(String part : parts){
            J+=part;
        }
    return J;}

    public static void main(String[] args) {
        String x = "(()())(())";
        System.out.println(Function(x));
    }
}
