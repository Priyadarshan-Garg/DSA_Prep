import java.util.Arrays;

public class Max_Prod_of_three_num {
    public static void main(String[] args) {
        int [] num ={1,2,3,4};
        System.out.println(maximumProduct(num));


    }static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int result =1;
        int distinct =1;
        for(int i =0;i<nums.length;i++){
            if(nums.length==3){
                result=nums[0]*nums[1]*nums[2];
                return result;
            } else  if(nums[i]<nums[i+1]){
                result=result*nums[i];
                distinct++;
                if(distinct==3){
                    return result;
                }
            }
        }
        return 1;  }
}
