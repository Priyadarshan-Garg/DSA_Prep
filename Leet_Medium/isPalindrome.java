import java.util.Arrays;

class isPalindrome {
    // mera function thoda sahi nahi hai
    public static boolean myFunction(String s) {
        if(s.isEmpty()){
            return true;
        }
        StringBuilder X = new StringBuilder();
        for(char c : s.toCharArray()){
            int x = c ;
            if(x>=48 && x<=57){
                return false;
            }
            // uppercase ko lower case me add kr do
            if(x>=65 && x<=90){
                c = (char)(c+32);
                X.append(c);
                continue;
            }
            // lower case ko sidha daal do
            if(x>=97 && x<=122){
                X.append(c);
            }
        }
        return X.toString().contentEquals(X.reverse());
    }
    public static boolean Function_2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        StringBuilder X = new StringBuilder();
        for (char c : s.toCharArray()) {
            int x = c;
            if (Character.isLetterOrDigit(c)) {  // Sirf letters aur digits ko consider karenge
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }
                X.append(c);
            }
        }
        String original = X.toString();
        return original.contentEquals(new StringBuilder(original).reverse());
    }


    public static void main(String[] args) {
        String s =  "A man, a plan, a canal: Panama";
//       StringBuilder X = new StringBuilder(s);
//      s = s.replaceAll(",","");
//     s =  s.replaceAll(" ","");
//     s = s.replaceAll(":","");
//     s = s.toLowerCase();

        System.out.println(myFunction("0P"));
    }
}