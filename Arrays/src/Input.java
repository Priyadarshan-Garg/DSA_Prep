import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int [5];
        for (int i =0; i<5;i++)
            arr[i]= in.nextInt();
for (int j=0;j<5;j++)
    System.out.println(arr[j]);
    }
}