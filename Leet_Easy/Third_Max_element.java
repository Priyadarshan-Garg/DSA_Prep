class Third_Max_element {
    public static void main(String[] args) {
        int [] nums ={2,2,3,1};
        System.out.println(thirdMax(nums));
    }
    static int thirdMax(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j] =  arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        int end =arr.length-1;
        int count=0;
        for(int k =end;k>0;k--){
            if(arr.length==1 || arr.length ==2){
                return arr[end];
            } else if(arr[k]>arr[k-1]){
                count++;
            } if(count==3){
                return arr[k-1];
            }

        }
  return  0; }
    static void swap(int [] arr,int f,int s){
        int temp =arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}