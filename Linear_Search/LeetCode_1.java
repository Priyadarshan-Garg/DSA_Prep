import java.util.Scanner;

public class LeetCode_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Even_int(arr));
    }
    static int Even_int (int[] arr){
       int start=0;
        for ( start=0;start< arr.length;start++){
            if(arr[start]%2==0){
                System.out.println(arr[start]);;
            }
        }
  return arr[start];  }
}
