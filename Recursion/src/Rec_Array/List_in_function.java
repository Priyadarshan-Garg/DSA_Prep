package Rec_Array;

import java.util.ArrayList;

public class List_in_function {
    static ArrayList<Integer> All_indicies(int [] arr,int target,int i){
        ArrayList<Integer> list= new ArrayList<>();
        if (i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ansBelow =  All_indicies(arr, target, i+1);
        list.addAll(ansBelow);
   return list; }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,5,2};
        System.out.println(All_indicies(arr,2,0));
    }
}
