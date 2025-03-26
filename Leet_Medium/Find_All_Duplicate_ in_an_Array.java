import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Find_All_Duplicate_in_an_Array {
    public static void main(String[] args) {
        int [] arr ={4,3,2,7,8,2,3,1};
//        System.out.println(Arrays.toString(findDuplicates(arr)));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i =0;
        int n  =nums.length;
        while(i<n){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            } else{i++;}
        }
        List<Integer> result = new ArrayList<>();
        for(int j =0;i<n;j++){
            if(nums[j]!=j+1){
                result.add(nums[i]);
            }
        }
        return result;  }
   public static void swap(int [] arr, int f,int s){
        int temp =arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
