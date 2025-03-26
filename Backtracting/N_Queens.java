public class N_Queens {

    public static void main(String[] args) {
        boolean[][] board= new boolean[6][6];
        System.out.println(Queen(board,0));;
    }

    public static boolean isSafe(boolean[] [] board,int row,int col){
        // checking above
        for (int i = 0; i < row ; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //checking left diagonal
        for (int j = row-1,k=col-1; j >=0 && k>=0 ; j-- ,k--) {
            if(board[j][k]){
                return false;
            }
        } // checking right diagonal
        for (int i = row-1,j=col+1; i >=0 && j< board[0].length ; i--,j++) {
                if(board[i][j]){
                    return false;
                }
        }
    return true;
    }
    public static int Queen(boolean[][] board,int row){
        if(row== board.length){
            Display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        for (int col = 0; col <board[0].length; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=Queen(board,row+1);
                board[row][col]=false;
            }
        }
    return count;
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

}
