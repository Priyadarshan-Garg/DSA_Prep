import java.util.ArrayList;
import java.util.List;

class smallest_missing_num {
    public static void main(String[] args) {
int  [] num = {7,8,9,11,12};
int  [] num1 = {3,4,-1,1};
int  [] num2 = {1,2,0};
//        System.out.println(findDuplicates(num));
//        System.out.println(findDuplicates(num1));
        System.out.println(findDuplicates(num2));
    }
    static int findDuplicates(int[] nums) {
        int i =0;
        int n  =nums.length;
        while(i<n){
            int correctIndex = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            } else{i++;}
        }

        for(int j =0;j<n;j++){
            if(nums[j]!=j+1){
              return j+1;
            }
        }
        return nums.length+1;  }
    static void swap(int [] arr, int f,int s){
        int temp =arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}