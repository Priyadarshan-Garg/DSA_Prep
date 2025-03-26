package Kunal;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        System.out.println(SeqArray("","abc"));
//        Seq("","abc");
        SeqAscii("", "abc");
    }

    static void  Seq(String changed,String Original){
        if(Original.isEmpty()){
            System.out.println(changed);
            return ;
        }

        char c= Original.charAt(0);
        Seq(changed+c,Original.substring(1));
        Seq(changed,Original.substring(1));

    }


    static ArrayList<String> SeqArray(String changed, String Original){
        if(Original.isEmpty()){
//            System.out.println(changed);
            ArrayList<String> list = new ArrayList<>();
            list.add(changed);
            return list;
        }

        char c= Original.charAt(0);
        ArrayList<String> left =SeqArray(changed+c,Original.substring(1));
        ArrayList<String> right = SeqArray(changed,Original.substring(1));
        left.addAll(right);
   return left;
    }

    static void  SeqAscii(String changed,String Original){
        if(Original.isEmpty()){
            System.out.println(changed);
            return ;
        }

        char c= Original.charAt(0);
        SeqAscii(changed+c,Original.substring(1));
        SeqAscii(changed,Original.substring(1));
        SeqAscii(changed + (c+0),Original.substring(1));
    }

}
