package REC_Pattern;

import java.util.Arrays;

public class Bubble {
    static void Sort(int[] arr, int r, int c){
        if(r==0){
            return;
        } if(c<r){
            if(arr[c]>arr[c+1]){
                int temp= arr[c];
                arr[c]=arr[c+1];
                arr[c+1]= temp;
            } Sort(arr,r,c+1);
        }else {
            Sort(arr,r-1,0);
        }
    }
    public static void main(String[] args) {
        int [] e={4,3,2,1};
        Sort(e,e.length-1,0);
        System.out.println(Arrays.toString(e));
    }
}
