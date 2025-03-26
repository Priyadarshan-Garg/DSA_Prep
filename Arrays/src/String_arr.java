import java.util.Arrays;
import java.util.Scanner;

public class String_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] arr= new String[4];
        for (int k=0;k< arr.length;k++ ){
            arr[k]=in.next();

//            System.out.println(arr[0]);
        }
        // modify
        arr[0]="pd";
        System.out.println(Arrays.toString(arr));
        // ye scope ke bahar se puch liya

}
    }

