public class Peak_Element_II {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,4},
                {3,5,1},
                {2,3,1}
        };
        System.out.println(findPeakGrid(arr));
    }

       static int FindMax(int [][] arr,int mid){
            int row =0;
            int max=0;
            for(int i =0;i<arr.length;i++){
                if(arr[i][mid]>max){
                    max=arr[i][mid];
                    row=i;
                }
            }
            return row;}
        static int[] findPeakGrid(int[][] arr) {
            int n =arr.length;
            int m= arr[0].length;
            int i =0;
            int j=m-1;
            while(i<=j){
                int mid=i+(j-i)/2;
                int row = FindMax(arr,mid);
                int left =-1;
                int right=-1;
                if(mid-1>=0){
                    left=arr[row][mid-1];
                } if(mid+1<m){
                    right =arr[row][mid+1];
                }
                if(arr[row][mid]>left && arr[row][mid]>right){
                    return new int [] {row,mid};
                }
                else if(arr[row][mid]<left){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
            return new int [] {-1,-1};  }
    }

