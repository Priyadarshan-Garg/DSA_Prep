public class N_Knights {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(Knights(board, 0, 0, 4)); // 4 is the number of knights to place
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Right-Up
        if (row - 1 >= 0 && col + 2 < board[0].length && board[row - 1][col + 2]) {
            return false;
        }
        // Right-Down
        if (row + 1 < board.length && col + 2 < board[0].length && board[row + 1][col + 2]) {
            return false;
        }
        // Left-Up
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2]) {
            return false;
        }
        // Left-Down
        if (row + 1 < board.length && col - 2 >= 0 && board[row + 1][col - 2]) {
            return false;
        }
        // Down-Left
        if (row + 2 < board.length && col - 1 >= 0 && board[row + 2][col - 1]) {
            return false;
        }
        // Down-Right
        if (row + 2 < board.length && col + 1 < board[0].length && board[row + 2][col + 1]) {
            return false;
        }
        // Up-Left
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1]) {
            return false;
        }
        // Up-Right
        if (row - 2 >= 0 && col + 1 < board[0].length && board[row - 2][col + 1]) {
            return false;
        }
        return true;
    }

    public static int Knights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            Display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // Traverse the board cell by cell
        for (int i = row; i < board.length; i++) {
            for (int j = (i == row ? col : 0); j < board[0].length; j++) {
                if (isSafe(board, i, j)) {
                    board[i][j] = true; // Place knight
                    count += Knights(board, i, j + 1, knights - 1); // Recur for remaining knights
                    board[i][j] = false; // Backtrack
                }
            }
        }

        return count;
    }

    public static void Display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print(" K ");
                } else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}



//public class N_Knights {
//
//    public static void main(String[] args) {
//        boolean [] [] board = new boolean[4][4];
//        System.out.println(Knights(board,0,0,4));
//    }
//
//
//    public static boolean isSafe(boolean[][] board, int row, int col) {
//        // Right-Up
//        if (row - 1 >= 0 && col + 2 < board[0].length && board[row - 1][col + 2]) {
//            return false;
//        }
//        // Right-Down
//        if (row + 1 < board.length && col + 2 < board[0].length && board[row + 1][col + 2]) {
//            return false;
//        }
//        // Left-Up
//        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2]) {
//            return false;
//        }
//        // Left-Down
//        if (row + 1 < board.length && col - 2 >= 0 && board[row + 1][col - 2]) {
//            return false;
//        }
//        // Down-Left
//        if (row + 2 < board.length && col - 1 >= 0 && board[row + 2][col - 1]) {
//            return false;
//        }
//        // Down-Right
//        if (row + 2 < board.length && col + 1 < board[0].length && board[row + 2][col + 1]) {
//            return false;
//        }
//        // Up-Left
//        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1]) {
//            return false;
//        }
//        // Up-Right
//        if (row - 2 >= 0 && col + 1 < board[0].length && board[row - 2][col + 1]) {
//            return false;
//        }
//        return true;
//    }
//    public static int Knights(boolean[][] board,int row,int col,int knights){
//        if(knights== board.length){
//            Display(board);
//            System.out.println();
//            return 1;
//        }
//        int count =0;
//        for (int i = row; i < board.length; i++) {
//            for (int j = (i == row ? col : 0); j < board[0].length; j++) {
//                if (isSafe(board, i, j)) {
//                    board[i][j] = true; // Place knight
//                    count += Knights(board, i, j + 1, knights - 1); // Recur for remaining knights
//                    board[i][j] = false; // Backtrack
//                }
//            }
//        }
//   return count; }
//    public static void Display(boolean[][]board){
//        for(boolean[] row : board){
//            for(boolean element : row){
//                if(element){
//                    System.out.print(" K ");
//                }
//                else {
//                    System.out.print(" X ");
//                }
//            }
//            System.out.println();  }
//    }
//}
