import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class LargestRectangleArea {
    public static int Function(int[] heights) {
        List list = Arrays.asList(heights);
        Collections.sort(list);
        int max = Integer.MIN_VALUE;
        int count =2;
        for(int i = list.size()-2;i>=0;i--){
            int max2 = (int)(list.get(i))*count;
            if(max>max2){
                return max;
            }
            max = Math.max(max,max2);
            count++;
        }
   return 0; }

    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
        List<int []> list = Arrays.asList(heights);
        for (int i = 0; i <list.size() ; i++) {

        }
        System.out.println(list);
//                System.out.println(Function());
    }
}