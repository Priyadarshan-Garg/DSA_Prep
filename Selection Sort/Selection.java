import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 8, 2, 1, 6, 9};

        // Before sorting
        System.out.println("Original array: " + Arrays.toString(arr1));

        // Call the selection sort function
        selection(arr1);

        // After sorting
        System.out.println("Sorted array: " + Arrays.toString(arr1));
    }

    // Function to swap elements in the array
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // Selection sort function
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;      // Last index for this pass
            int maxIndex = getMaxIndex(arr, 0, last);  // Find max in the unsorted part
            swap(arr, maxIndex, last);          // Swap max with the last unsorted element
        }
    }

    // Function to get the index of the maximum element in the range
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {  // Iterate through the range (inclusive of 'end')
            if (arr[max] < arr[i]) {
                max = i;  // Update max index if a larger element is found
            }
        }
        return max;  // Return the index of the maximum element
    }
}





























//import java.util.Arrays;
//
//public class Selection {
//    public static void main(String[] args) {
//int [] arr1 ={7,3,8,2,1,6,9};
//int [] arr2 = selection(arr1);
//        System.out.println();
//    } static void swap(int [] arr, int start, int end){
//        int tem = arr[start];
//        arr[start]=arr[end];
//        arr[end]=tem;
//    }
//    static void selection(int [] arr){
//        for (int i = 0; i <arr.length ; i++) {
//            int last = arr.length-i-1;
//            int maxIndex =getMaxIndex(arr,0,last);
//            swap(arr,maxIndex,last);
//        }
//    }
//    static int getMaxIndex(int[] arr,int start,int end){
//        int max = start;
//        for (int i = start; i <end ; i++) {
//            if(arr[max]<arr[i]){
//                max=i;
//            }
//        }
//   return max; }
//}
