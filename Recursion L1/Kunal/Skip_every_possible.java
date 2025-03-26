package Kunal;
// Skip 'a'
public class Skip_every_possible {
    public static void main(String[] args) {
        Skip("","areoo");
        System.out.println(Skipping("areoo"));
        System.out.println(SkipWord("Hiappleboy","apple"));
        System.out.println(SkipSubWord("himyappisapple","apple","app"));
    }
//    public static int l =0;
    public static void Skip(String changed, String Original){
        if(Original.isEmpty()){
            System.out.println(changed);
            return;
        }
        char c = Original.charAt(0);
        if(c=='a'){
            Skip(changed,Original.substring(1));
        }
        else{
            Skip(changed +c,Original.substring(1));
        }
    }

    //with return type

    public static String Skipping( String Original){
        if(Original.isEmpty()){
            return "";
        }
        char c = Original.charAt(0);
        if(c=='a'){
         return    Skipping(Original.substring(1));
        }
        else{
        return  c+ Skipping( Original.substring(1));
        }
    }
    public static String SkipWord(String given,String word){
        if(given.isEmpty()){
            return "";
        }
        char ch = given.charAt(0);
        if(given.startsWith(word)){
            return SkipWord(given.substring(5),word);
        }
        else
            return ch+SkipWord(given.substring(1),word);

    }


    public static String SkipSubWord(String given,String wordIgnore, String remove) {
        if (given.isEmpty()) {
            return "";
        }
        char ch = given.charAt(0);
        if (given.startsWith(remove)) {
            if (given.startsWith(wordIgnore)) {
                return ch+ SkipSubWord(given.substring(1), wordIgnore, remove);
            }
            else
                return SkipSubWord(given.substring(3),wordIgnore,remove);
        }
            return ch + SkipSubWord(given.substring(1), wordIgnore, remove);


    }
}
