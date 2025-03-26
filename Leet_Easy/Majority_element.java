class Majority_element {
    public static void main(String[] args) {
  int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        int i =1;
        while(i<nums.length){
            if(nums[i]<nums[i-1]){
                swap(nums,i,i-1);
            } else{
                i++;
            }
        }
        int majority =nums.length/2;
        for(int j =0;j<nums.length;j++){
            int count =1;
            for(int k =j+1;k<nums.length;k++){
                if(nums[j]==nums[k]){
                    count++;
                    if(count>majority){
                        return nums[k];
                    }
                }
            } 
        }
  return 1;  }
    static void swap(int [] arr,int f,int s){
        int temp =arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}