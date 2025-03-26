class validPalindrome {
    public static boolean myFunction(String s) {
        StringBuilder X = new StringBuilder(s);
        String S = X.reverse().toString();
        if(S.contentEquals(s)){
            return true;
        }
        // ab ek char change karo and check karte chalo
        for(int i = 0;i<X.length();i++){
            X.deleteCharAt(i);
           String m = X.reverse().toString();
           if(m.contentEquals(s)){
            return true;
            }
            X = new StringBuilder(s);
        }

   return false; }

    public static void main(String[] args) {
        String S = "deeee";
        System.out.println(myFunction(S));
    }
}