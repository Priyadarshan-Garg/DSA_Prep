public class Search_in_Range {
    public static void main(String[] args) {
        int[] arr ={1,234,-23,52,46,-5,65,-55,67,69};
        int Target = 52;
        System.out.println(Range(arr,0,9,Target));
    }
    static boolean Range(int []arr, int start, int end,int Target){
        if(start>end){
            return false ;
        }

// int index;
//        start =arr[index];
//        end = arr.length -1;
        for(int index=start; index<=end;index++){
            int element = arr[index];
            if(Target== element){
                return true;
            }
        }

   return false; }
}
