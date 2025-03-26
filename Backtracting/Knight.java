public class Knight{

    public static void main(String[] args) {
        int n = 4; // Size of the board (n x n)
        boolean[][] board = new boolean[n][n];
        System.out.println("Total configurations: " + placeKnights(board, 0, 0, n));
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Check all possible knight moves
        int[][] directions = {
                {-2, -1}, {-2, +1}, {-1, -2}, {-1, +2},
                {+1, -2}, {+1, +2}, {+2, -1}, {+2, +1}
        };
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length && board[newRow][newCol]) {
                return false;
            }
        }
        return true;
    }

    public static int placeKnights(boolean[][] board, int row, int col, int knightsLeft) {
        if (knightsLeft == 0) {
            return 1; // All knights placed successfully
        }
        if (row == board.length) {
            return 0; // End of board reached
        }

        int count = 0;

        // Calculate next row and column for traversal
        int nextRow = (col == board[0].length - 1) ? row + 1 : row;
        int nextCol = (col == board[0].length - 1) ? 0 : col + 1;

        // Try placing a knight at the current cell
        if (isSafe(board, row, col)) {
            board[row][col] = true; // Place the knight
            count += placeKnights(board, nextRow, nextCol, knightsLeft - 1);
            board[row][col] = false; // Backtrack
        }

        // Skip placing a knight at the current cell
        count += placeKnights(board, nextRow, nextCol, knightsLeft);

        return count;
    }
}
