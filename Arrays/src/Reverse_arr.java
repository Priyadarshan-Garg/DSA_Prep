import java.util.Arrays;

public class Reverse_arr {
    public static void main(String[] args) {
        int[]srr = {1,8,3,4,6};
        reverse(srr);
        System.out.println(Arrays.toString(srr));
    }
    static void reverse(int []arr)
    {
        int start =0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
static void swap(int []arr, int index1,int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
//        return index2;
}}
