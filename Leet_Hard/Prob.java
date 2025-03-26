public class Prob {
  static   String recursion(String str,StringBuilder change){
        StringBuilder X  = new StringBuilder(str);
        char c = X.charAt(0);
        if(str.isEmpty()){
            return change.reverse().toString();
        }
        if(c=='('){
            change.reverse();
            recursion(str.substring(1),change);
        }
        if(c==')'){
            change.reverse();
            recursion(str.substring(1),change);
        }
        change.append(c);
        return recursion(str.substring(1),change);
    }

    public static void main(String[] args) {
        StringBuilder N = new StringBuilder();
        System.out.println(recursion("(u(love)i)",N));
        char [][] board = new char[4][];
        
    }
}
