//https://leetcode.com/problems/parsing-a-boolean-expression/submissions/1546270568/

import java.util.ArrayList;
import java.util.Stack;

class parseBoolExpr {
    public static boolean Function(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c==','){
                continue;
            }
            if(c==')'){
                ArrayList<Character> list = new ArrayList<>();
                while(!stack.isEmpty() && stack.peek()!='('){
                    list.add(stack.peek());

                    stack.pop();
                }
                stack.pop(); //last me ( isko hatane ke liye
                char ch = stack.peek();
                stack.pop();
                stack.push(solve(ch,list));

            } else
                stack.push(c);
        }
        return stack.peek()=='t'? true:false;
    }
    static char solve(char c , ArrayList<Character> X){
        if(c=='!'){
            return X.get(0)=='t'?'f':'t';
        }
        if(c=='&'){
            return X.contains('f')?'f':'t';
        }
        return X.contains('t')?'t':'f';
    }

    public static void main(String[] args) {


    }

}