import java.util.Arrays;

public class ReverseString {
    public static void myFunction(char [] s){
        int end = s.length-1;
        int start = 0;
//        char [] res = new char[s.length];
        while (start<=end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        myFunction(s);
    }
}
