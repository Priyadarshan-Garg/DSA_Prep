public class Palindrome {
    public static void main(String[] args) {
 String Str = "ab";
        System.out.println(Rev( Str));
    } static boolean Rev(String in){
        for (int i = 0; i < in.length(); i++) {
            int start = in.charAt(i);
            int end = in.charAt(in.length()-1-i);
            if (start!=end){
                return false;
            } if (in.length()==0){
                return true;
            }
        }
  return true;  }
}
