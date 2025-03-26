import java.util.Arrays;

public class Two_Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
//int target =35;
        System.out.println(Arrays.toString(Search(arr,37)));}
    static int [] Search(int [][] matrix,int target){
        int r =0;
        int c = matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }if(target>matrix[r][c]){
                r++;
            }else{
                c--;
            }
        }
   return new int []{-1,-1}; }
}
