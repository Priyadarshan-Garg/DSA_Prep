package Kunal;

public class Permutations {
    public static void main(String[] args) {
        permutation("","abc");
    }

    static void permutation(String changed,String Original){
        if (Original.isEmpty()) {
            System.out.println(changed);
            return;
        }
        char c = Original.charAt(0);
        for (int i = 0; i < changed.length(); i++) {
            String first = changed.substring(0,i);
            String second = changed.substring(i,changed.length());
            permutation(first+c+second,Original.substring(1));
        }
    }

}
