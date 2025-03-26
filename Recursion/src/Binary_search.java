public class Binary_search {
    public static void main(String[] args) {
        int [] r ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(BS(r,4,0,r.length-1));
    }
    static int BS(int [] arr,int target,int s , int e){
        if(s>e){
            return -1;
        } int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        } else if (target<arr[mid]) {
            return BS(arr, target, s, mid-1);
        } else{
            return BS(arr, target, mid+1,e);
        }
    }
}
