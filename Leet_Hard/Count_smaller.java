import java.util.ArrayList;
import java.util.List;

public class Count_smaller {
    public static void main(String[] args) {
        int []  nums = {5,2,6,1};
        List<Integer> result = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int count=0;
            for(int j =0;j<nums[i];j++){
                if(Search(nums,j)){
                    count++;
                }
                result.add(count); }
            System.out.println(result);   }
    } static boolean Search(int [] nums,int target){
        int initial =0;
        int start =0;
        int end =nums.length-1;
        while(initial<target){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(initial==nums[start]){
                    return true;
                } else if( nums[start]<nums[mid]){
                    start=mid;
                } else{
                    end=mid-1;
                }
                 }
            initial++;   }
        return false;}
}
