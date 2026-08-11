class Solution {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {
                    if (!isValid(board, i, j)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

   
    public boolean isValid(char[][] board, int row, int col) {

        char num = board[row][col];

        // Row check
        for (int j = 0; j < 9; j++) {
            if (j != col && board[row][j] == num) {
                return false;
            }
        }

        // Column check
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == num) {
                return false;
            }
        }

        // Grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;  

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if ((i != row || j != col) && board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}