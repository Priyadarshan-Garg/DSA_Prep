import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] num = {1,43,74,32,2,9};
        System.out.println(Arrays.toString(sortArray(num,0, num.length)));
    }

    private static int[] sortArray(int[] arr,int start,int end) {
        int mid = start+(end-start)/2;
        if(start>=end-1) return new int[]{arr[start]};
        int[] left = sortArray(arr, start, mid);
        int[] right = sortArray(arr, mid, end);
        return  merge(left,right);




    }

    private static int[] merge(int[] left ,int[] right) {
        int length = left.length + right.length;
        int j =0,k=0,i=0;
        int [] res = new int[length];
       while (i< left.length && j<right.length ){
            if(left[i]<=right[j]){
                res[k++]=left[i++];
            }
            else res[k++] = right[j++];

        }
        while (left.length>i){
            res[k++] = left[i++];
        }
        while (j<right.length){
            res[k++] = right[j++];
        }
   return res; }
}
