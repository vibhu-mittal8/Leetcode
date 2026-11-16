class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int count = 0;
                for (int r = -1; r <= 1; r++) {
                    for (int c = -1; c <= 1; c++) {

                        if (r == 0 && c == 0) {
                            continue;
                        }

                        int x = i + r;
                        int y = j + c;

                        if (x >= 0 && y >= 0 &&
                            x < m && y < n &&
                            (board[x][y] & 1) == 1) {
                            count++;
                        }
                    }
                }
                if (board[i][j] == 1) {
                    if (count == 2 || count == 3) {
                        board[i][j] = 3;
                    }
                } 
                else {
                    if (count == 3) {
                        board[i][j] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1;
            }
        }
    }
}