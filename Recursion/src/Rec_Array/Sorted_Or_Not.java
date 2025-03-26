package Rec_Array;

public class Sorted_Or_Not {
    public static void main(String[] args) {
        int [] A = {1,2,3,6,5};
        System.out.println(arr(A,0));
        System.out.println(kunal(A,0));
    } static boolean arr(int [] ar,int i){
        if(i==ar.length-1){
            return true;
        } if(ar[i]<ar[i+1]){
            return arr(ar,i+1);
        }
  return false;  }
    static boolean kunal (int [] arr, int index){
        if(index==arr.length-1){
            return true;
        }
    return arr[index]<arr[index+1] && kunal(arr,index+1);}
}
