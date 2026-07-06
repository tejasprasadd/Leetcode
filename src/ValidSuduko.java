import java.util.*;


class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                if ((!seen.add(stringify("row", r, board[r][c]))) || (!seen.add(stringify("col", c, board[r][c]))) || (!seen.add(stringify("box", r / 3, c / 3, board[r][c])))) {
                    return false;
                }
            }
        }
        return true;
    }

    private String stringify(String direction, int num, char value) {
        return new StringBuilder(direction).append("-").append(num).append("#").append(value).toString();
    }

    private String stringify(String box, int r, int c, char value) {
        return new StringBuilder(box).append("-").append(r).append("-").append(c).append("#").append(value).toString();
    }
}

public void main(String[] args) {
    Solution solution = new Solution();
    char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };
    boolean result = solution.isValidSudoku(board);
    System.out.println(result);
}