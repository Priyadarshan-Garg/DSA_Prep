import java.util.*;

public class RemoveKDigits {
    public static String Function(String num,int k){
        if(num.length()==k) return "0";
        Stack<Character> stack = new Stack<>();
        for(char c :num.toCharArray()){
            while(!stack.isEmpty() && stack.peek()>c && k>0){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder X = new StringBuilder();
        while(!stack.isEmpty()){
            X.append(stack.pop());

        }
        X.reverse();
        while (X.length() > 0 && X.charAt(0) == '0') {
            X.deleteCharAt(0);
        }

        return X.length()==0 ? "0" : X.toString();
    }

    public static void main(String[] args) {
        String x ="1432219";
        System.out.println(Function(x,3));
        List list = Arrays.asList(13,33,6,3,264,1439);
        Collections.sort(list);
        int max = (int) list.get(3);
        System.out.println();
    }
}
