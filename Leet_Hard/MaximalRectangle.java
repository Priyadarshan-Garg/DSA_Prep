//import java.util.Stack;
//
//class maximalRectangle {
//
//    int Histogram(int [] arr){
//        Stack<Integer> stack = new Stack<>();
//        int max = 0;
//        for(int i = 0;i<=arr.length;i++){
//            int h = (i==arr.length) ? 0 : arr[i];
//            while(!stack.isEmpty() && arr[stack.peek()]>h){
//                int height = arr[stack.peek()];
//                int width = stack.isEmpty()?i:i-stack.peek()-1;
//                max = Math.max(max,height*width);
//            }
//            stack.push(i);
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
////        System.out.println(Function());
//    }
//    public static int Function(char[][] matrix) {
//        int [] list = new int [matrix[0].length];
//        //  System.arraycopy(matrix[0], 0, list, 0, matrix[0].length); --> ye char ko int me convet nahi kar sakta
//        for(int m = 0;m<matrix[0].length;m++){
//            list[m] = matrix[0][m];
//        }
//        for(int i = 1;i<matrix.length;i++){
//            for(int j = 0;j<matrix[0].length;j++){
//                if(matrix[i][j]==1){
//                    list[j] +=1;
//                }
//            }
//        }
//        return Histogram(list); }
//}