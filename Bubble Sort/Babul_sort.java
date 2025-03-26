import java.util.Arrays;

public class Babul_sort {
    public static void main(String[] args) {
int [] arr ={9,4,6,3,5,7};
        Babul(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Babul(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                  arr[j] =  arr[j-1];
                     arr[j-1]=temp;
                }
            }
        }
    }
}
