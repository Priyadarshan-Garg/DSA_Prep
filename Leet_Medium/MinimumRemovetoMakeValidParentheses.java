import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {

    public String Function(String s) {
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
//        String m = "003172980";
//        int xx = Integer.parseInt(m);
//        System.out.println(xx);
        StringBuilder S = new StringBuilder();
int k  = 13;
int j = k;
j =j-3;
        System.out.println(k + " "+j);
    }
}
