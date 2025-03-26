public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights,5));

    }
    static int shipWithinDays(int[] weights, int days) {

        int right=Sum_of_weights(weights);
        int left =MaxVal(weights);
        while(left<=right){
            int mid = left+(right-left)/2;
            int Sum =0;
            int subArr=1;
            for(int num:weights){
                Sum+=num;
                if(Sum>mid){
                    subArr++;
                    Sum=num;
                }
                if(subArr<days){
                    right=mid;
                } else{
                    left=mid+1;
                }
            }
        }


        return right; }
   static int Sum_of_weights(int [] arr){
        int Weight =0;
        for(int num:arr){
            Weight+=num;
        }

        return Weight;}
   static int MaxVal(int [] arr){
        int max= 0;
        for(int num:arr){
            max=Math.max(max,num);
        }
        return max;
    }
}

