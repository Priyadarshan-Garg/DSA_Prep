import java.util.Arrays;

public class Amazon {
    public static void main(String[] args) {
        int [] arr ={1,0,3,5,4};
        sort(arr);
       System.out.println(Arrays.toString(arr));

    }static void swap(int [] arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
   static int sort(int[] arr){
        int i =0;
        int n = arr.length;
        while(i<arr.length){
             int checkIndex =arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[checkIndex]){
                swap(arr,arr[i],arr[i]);
            } else{
                i++;
            }
        }
        // searching
       for (int Index = 0; Index <arr.length ; Index++) {
           if (Index !=arr[Index] ) {
               return Index;
           }


       }
       return n;   }
}
