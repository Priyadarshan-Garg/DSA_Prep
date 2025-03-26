import java.util.Arrays;
import java.util.Scanner;

public class Two_D_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][ ]arr = int [3][];
//        Ese nahi karte hai
//        System.out.println("Enter the number of rows");
//         int rows = in.nextInt();
//        System.out.println("Enter the number of column");
//        int col = in.nextInt();
        int[][] arr = new int[3][];
//        int[][] arr2 = new int [row][col];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }}
