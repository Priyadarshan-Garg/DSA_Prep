public class Search_in_2D_arr {
    public static void main(String[] args) {
        int [][] arr ={
                {1,324,646,},
                {12441,65,-57},
                {214,21,745}
        };
        System.out.println(Search(arr));
    }
    static int Search(int [][]arr){
        int MaxVal;
        MaxVal= arr[0][0];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(MaxVal<arr[i][j]){
                    MaxVal=arr[i][j];
                }
            }
        }
    return MaxVal;}
}
