public class Min_num {
    public static void main(String[] args) {
        int[] arr = {13,-1,24,35,646,-27};
        System.out.println(Min(arr));
    }
    static int Min(int [] arr ){
        int MinVal=arr[0];
        if(arr==null){
            System.out.println("Invalid");
        }
        for (int i=0; i<arr.length;i++){

            if (MinVal>arr[i]){
                MinVal=arr[i];
            }
        }
   return MinVal; }
}
