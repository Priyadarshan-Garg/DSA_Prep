class Contains_Duplicate {
    public static void main(String[] args) {
        int [] nums ={2,2,3,1};
        System.out.println(containsDuplicate(nums));
     }
    static boolean containsDuplicate(int[] nums) {
          int i =1;
        while(i<nums.length){
            if(nums[i]<nums[i-1]){
                swap(nums,i,i-1);
            } else{
                i++;
            }
        } for(int k =0;k< nums.length;k++){
            for(int j =k+1;j<nums.length;j++){
                if(nums[k]==nums[j]){
                    return true;
                }
            }
        }
  return false;  }
    static void swap(int [] arr,int f,int s){
        int temp =arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}