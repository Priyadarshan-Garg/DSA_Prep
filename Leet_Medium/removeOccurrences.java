//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

class removeOccurrences {
    //Yeh mera Approach
    public String Function1(String s, String part) {
        while(s.contains(part)){
            s =  s.replaceFirst(part, "");
        }
        return s;
    }

    public static void main(String[] args) {

    }
}
