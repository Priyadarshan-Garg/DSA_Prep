import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    } static void Sort(int [] arr){
       int i =0;
       while (i<arr.length){
           int correctIndex =arr[i]-1;
           if(arr[i]!=arr[correctIndex]){
               swap(arr,i,correctIndex);
           } else{
               i++;
           }
        }
    }
    static void swap(int [] arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
