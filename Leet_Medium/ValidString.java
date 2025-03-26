import java.util.Stack;

public class ValidString {
    public static String FUnction(String s){
        Stack<Integer> stack = new Stack<>();
        StringBuilder X = new StringBuilder(s);
        for(int i = 0;i<X.length();i++){
            if(X.charAt(i)=='('){
                stack.push(i);
            }
            if(X.charAt(i)==')'){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                else{
                    X.setCharAt(i,'*');
                }
            }

        }
        while(!stack.isEmpty()){
            X.setCharAt(stack.peek(),'*');
            stack.pop();
        }
        return X.toString().replace("*","");
    }

    public static void main(String[] args) {
        System.out.println(FUnction("lee(t(c)o)de)"));
    }
}
