//class Solution {
//    public static boolean exist(char[][] board, String word) {
//        int rows = board.length;
//        int cols = board[0].length;
//
//        // Try every cell as the starting point
//        for (int r = 0; r < rows; r++) {
//            for (int c = 0; c < cols; c++) {
//                if (backtrack(board, word, 0, r, c)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static boolean backtrack(char[][] board, String word, int index, int r, int c) {
//        // Base Case: If all characters are matched
//        if (index == word.length()) {
//            return true;
//        }
//
//        // Out of bounds or character mismatch
//        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(index)) {
//            return false;
//        }
//
//        // Mark the cell as visited by modifying it temporarily
//        char temp = board[r][c];
//        board[r][c] = '#';
//
//        // Explore all 4 directions
//        boolean found = backtrack(board, word, index + 1, r + 1, c) || // Down
//                        backtrack(board, word, index + 1, r - 1, c) || // Up
//                        backtrack(board, word, index + 1, r, c + 1) || // Right
//                        backtrack(board, word, index + 1, r, c - 1);   // Left
//
//        // Restore the cell's value
//        board[r][c] = temp;
//
//        return found;
//    }
//
//    public static void main(String[] args) {
//      char [] []  board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        String word = "ABCCED";
//        System.out.println(exist(board,word));
//    }
//}
