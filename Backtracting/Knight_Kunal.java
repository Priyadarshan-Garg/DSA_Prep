public class Knight_Kunal {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        Knight(board,0,0,4);
    }
    public static  void Knight(boolean[][] board,int row ,int col,int knight){
        if(knight==0){
            Display(board);
            System.out.println();
            return;
        }
        if(col== board.length){
            Knight(board,row+1,col,knight);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            Knight(board,row,col+1,knight-1);
            board[row][col]=false;
        }

    }

    public static void Display(boolean[][] board){
        for (boolean [] row: board){
            for(boolean element : row){
                if(element){
                    System.out.print(" Q ");
                }
                else System.out.print(" X ");
            }
            System.out.println();  }
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
}
