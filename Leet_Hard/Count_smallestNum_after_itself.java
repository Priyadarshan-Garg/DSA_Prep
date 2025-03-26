import java.util.ArrayList;
import java.util.List;

class Count_smallestNum_after_itself{
    public static void main(String[] args) {
    int [] nums ={5,2,6,1};
        System.out.println(countSmaller(nums));
    } static List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int end = nums.length-1;
        int start =0;
        int index =0;
        while(index<=end){
            int mid = start +(end-start)/2;
            int count=0;
            if(nums[mid]<nums[index]){
                count ++;
                 start=mid;
            } else if (nums[index]>nums[end]){
               end=end-1;
            }
            result.add(count);
            index++;  }
        return result;  }
}