import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] a ={5,2,4,1,6,9};
        System.out.println(Arrays.toString(Sort(a)));
    }
    static int [] Sort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = Sort(Arrays.copyOfRange(arr,0,mid));
        int [] right = Sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merging(left,right);
    }

    private static int[] merging(int [] first, int [] second) {
    int [] mix = new int [first.length+ second.length];
    int i =0;
    int j =0;
    int k =0;
    while(i< first.length && j< second.length){
        if(first[i]<second[j]){
            mix[k]= first[i];
            i++;
        }
        else{
            mix[k]= second[j];
            j++;
        }
        k++;
    }
    while (i< first.length){
        mix[k]= first[i];
        i++;
        k++;
    }
        while (j< second.length){
            mix[k]= second[j];
            j++;
            k++;
        }
    return mix;}
}