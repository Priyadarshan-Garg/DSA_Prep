public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {-20,-18,-15,-14,-9,6,-3,-2,-1,0,1,3,4,5,7,8,10,14,19,34,45};
        // CONDITION FOR BINARY SEARCH
        // array must be sorted already
        int Target = 0;
        System.out.println(Binary_search(arr,Target));
    }
    static int Binary_search(int[] arr, int target ){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
//            int mid = (start+end)/2;
            // yaha agar humne array ki size badi rakh di to ye
            // int ki range se exceed krke error de skta hai....
            int  mid= start+(end-start)/2;
            // same but better way to write
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            } else{
                return mid;

            }
        }
   return -1; }
}
