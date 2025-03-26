public class Char_Search {
    public static void main(String[] args) {
String x = "Priyadarshan";
char c = 'n';
        System.out.println( Search(x,c));
    }
    static boolean Search(String str, char Target){
        if(str.length()==0){
            return false;
        }
        for (int i=0; i<str.length();i++) {
            if(Target== str.charAt(i)){

            return true;
            }
        }
   return false; }
}
