import java.util.Stack;

public class LargestHistogram {
    public static int Function(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] > h) {
                int height = heights[stack.pop()];
                int weight = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * weight);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
     int [] arr = {2,1,5,6,2,3};
//        System.out.println(Function(heights));
        int[] p = {1,1};
        System.out.println(Function2(p));
        StringBuilder X = new StringBuilder();
        String str ="";
        X.append(str);
        System.out.println(X.reverse().toString());
    }
    public static int Function2(int [] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i-1; // left jane ke liye
            int k = i+1; // right jane ke liye
            int count = 1;
            while(j>=0 && arr[j]>=arr[i]){
                count++;
                j--;
            }
            while(k<=arr.length-1 && arr[k]>=arr[i]){
                count++;
                k++;
            }
            max = Math.max(max,count*arr[i]);
        }
  return max;  }
}