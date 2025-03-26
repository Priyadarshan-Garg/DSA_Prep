public class Rotation_Count {
    public static void main(String[] args) {
       int [] arr = { 15,18,2,3,6,12};
        int index = FindPivot(arr);
        int rotations = index +1;
//        System.out.println(index);
        System.out.println(rotations);
    }
    static int FindPivot(int [] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (start>=mid) {
                end=mid-1;
            } else {
                start = mid+1;
            }
        }
    return -1;}
}
