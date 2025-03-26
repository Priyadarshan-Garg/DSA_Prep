import java.util.Scanner;

public class Array__input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int [7];
//for(int i = 0; i<arr.length; i++){
//    arr[i] = in.nextInt();
//    // yeh input me lega
//}
//for(int j= 0; j<arr.length; j++){
//    System.out.println(arr[j]);
        for(int i =0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
}

        // declared 6 elements will be present
//        arr=in.nextInt();
    }

