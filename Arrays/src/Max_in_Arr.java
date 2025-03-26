public class Max_in_Arr {
    public static void main(String[] args) {
int [] arr={1,35,523,74};
        System.out.println(maxrange(arr,0,3));
    }
    static int maxrange(int arr[], int start,int end){
       if (start>end){
           return -1;
       }if (arr==null){
           return -1;
        }
       int maxval= arr[start];
       for (int i=start;i<=end;i++){
       if (maxval<arr[i]){
           maxval=arr[i];
       }


       }


       return maxval;
    }
}
