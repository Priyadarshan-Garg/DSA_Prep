public class Floor {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 9, 14, 16, 18};
        int target =15;
        int ans = ceiling(num,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int Target){
        if(Target>arr[arr.length-1]){
            return-1;
        }
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(Target<arr[mid]){
                end= mid-1;
            }
            else if(Target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return arr[end];}
}

