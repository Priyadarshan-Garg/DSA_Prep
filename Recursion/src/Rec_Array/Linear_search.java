package Rec_Array;

import java.util.ArrayList;

public class Linear_search {
    static boolean search(int [] arr, int target, int index){
        if(arr[index]==target || search(arr,target,index+1) && index+1<arr.length){
            return true;
        }
   return false; }

    static ArrayList<Integer> allindecies(int [] arr, int target,int index,ArrayList<Integer> list){
        if(arr[index]==target){
            list.add(index);
        } if(index==arr.length){
            return list;
        }
   return  allindecies(arr,target,index+1, list);
    }
    public static void main(String[] args) {
        int [] A = {1,4,6,3,3,7,8,5};
        int n = A.length-1;
        System.out.println(search(A,5,0));
      ArrayList<Integer> ans=  allindecies(A,3,0,new ArrayList<>());
        System.out.println(ans);
    }
}
