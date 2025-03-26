import java.util.Arrays;

public class Sorted_twoD_Search_mine {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2, 3,4  },
                {5,6 ,7 ,8 },
                {9,10 ,11 ,12 },
                {13,14 ,15 ,16 }
        };
//int target =35;
        System.out.println(Arrays.toString(Search(arr,2)));
    }
    static int [] Search(int [][] matrix,int target){
        int c =0;
        int r = matrix.length-1;
        while(c<matrix.length && r>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }if(target<matrix[r][c]){
                r--;
            }else{
                c++;
            }
        }
        return new int []{-1,-1}; }
}
