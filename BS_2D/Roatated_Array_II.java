public class Roatated_Array_II {
    public static void main(String[] args) {
int [] arr ={1,3,0,1};
        System.out.println(Search(arr));
    }static int Search(int [] arr){
        int left =0;
        int right =arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[right]>arr[mid]){
                right =mid;
            }
            else if(arr[right]==arr[mid]){
                right =right-1;
            }
          else {
                left=mid+1;
            }
        }
    return arr[left];}
}
