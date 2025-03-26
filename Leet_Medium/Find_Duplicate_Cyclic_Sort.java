public class Find_Duplicate_Cyclic_Sort {
    public static void main(String[] args) {
 int [] nums = {1,3,4,2,2};
        System.out.println(Sorting(nums));
    } static void swap(int[] arr, int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    } static int Sorting(int [] arr){
        int i =0;
        int n = arr.length;
        while (i<n){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else {
                if(i!=correctIndex){
                    return arr[i];
                }
            }
       i++; }
        // Actually iski jarurat hi nahi hai..
//        for (int Index = 0; Index <n ; Index++) {
//            if (arr[Index] != Index+1) {
//                return arr[Index];
//            }
//
//        }
    return -1;}
}
