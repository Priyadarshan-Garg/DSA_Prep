package Kunal;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(padRet("","12"));
    }


    static void pad(String changed,String original){
        if (original.isEmpty()) {
            System.out.println(changed);
            return;
        }
        int digit = original.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit *3 ; i++) {
            char ch = (char)('a'+i);
            pad(changed+ch,original.substring(1));
        }
    }


    static ArrayList<String> padRet(String changed, String original){
        if (original.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(changed);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = original.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit *3 ; i++) {
            char ch = (char)('a'+i);
            ans.addAll(padRet(changed+ch,original.substring(1)));
        }
   return ans; }
}
