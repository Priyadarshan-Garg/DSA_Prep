//public class Facebook_problem {
//    public static void main(String[] args) {
//int [] arr = {1,2,4,6,7,7,7,7,7,8,9,10};
//int target = 7;
//        System.out.println(searchRange(arr,target));
//    }    public static int[] searchRange(int[] nums, int target) {
//
//        int[] ans = {-1, -1};
//        // check for first occurrence if target first
////        ans[0] = search(nums, target, true);
////        if (ans[0] != -1) {
////            ans[1] = search(nums, target, false);
//        }
////        return ans;
//    }
//
//    static int  Search(int[] arr, int Target, boolean findindexof){
//        int ans= -1;
//        if(Target>arr[arr.length-1]){
//            return-1;
//        }
//        int start = 0;
//        int end= arr.length-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//
//            if(Target<arr[mid]){
//                end= mid-1;
//            }
//            else if(Target>arr[mid]){
//                start=mid+1;
//            }
//            else {
//                ans=mid;
//                if(findindexof){
//                    end = mid-1;
//                }
//                else{
//                    start = end+1;
//                }
//            }
//        }
//        return ans;}
//}
