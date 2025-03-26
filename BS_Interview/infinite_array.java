public class infinite_array {
    public static void main(String[] args) {
int [] arr ={1,2,4,6,8,9,10,12,14,15,16,17,20,30};
int tar = 15;
        System.out.println(ans(arr,tar));
    }
    static int ans(int [] arr, int Target){
        int start = 0;
        int end = 1;
        while(Target>end){
           int  newstart = end+1;
            end = end+ (end-start+1)*2;
            start = newstart;
        }
   return Search(arr,Target,start,end); }
    static int Search(int[] arr, int Target, int start
           , int end){


        while(start<=end){
            int mid = start+(end-start)/2;

            if(Target<arr[mid]){
                end= mid-1;
            }
            else if(Target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;}
}
