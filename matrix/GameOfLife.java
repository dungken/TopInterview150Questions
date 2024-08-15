package matrix;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0; // Dem con lan can con song
                // Tay Bac
                if(i - 1 >= 0 && j - 1 >= 0) {
                    count = board[i - 1][j - 1] == 1 ? count + 1 : count;
                }

                // Bac
                if(i - 1 >= 0) {
                    count = board[i - 1][j] == 1 ? count + 1 : count;
                }

                // Dong Bac
                if(i - 1 >= 0 && j + 1 < n) {
                    count = board[i - 1][j + 1] == 1 ? count + 1 : count;
                }

                // Dong
                if(j + 1 < n) {
                    count = board[i][j + 1] == 1 ? count + 1 : count;
                }

                // Dong Nam
                if(i + 1 < m && j + 1 < n) {
                    count = board[i + 1][j + 1] == 1 ? count + 1 : count;
                }

                // Nam
                if(i + 1 < m) {
                    count = board[i + 1][j] == 1 ? count + 1 : count;
                }

                // Tay Nam
                if(i + 1 < m && j - 1 >= 0) {
                    count = board[i + 1][j - 1] == 1 ? count + 1 : count;
                }

                // Tay
                if(j - 1 >= 0) {
                    count = board[i][j - 1] == 1 ? count + 1 : count;
                }

                if(board[i][j] == 1 && count < 2) {
                    temp[i][j] = 0;
                } else if(board[i][j] == 1 && count <= 3) {
                    temp[i][j] = 1;
                } else if(board[i][j] == 1 && count > 3) {
                    temp[i][j] = 0;
                } else if(board[i][j] == 0 && count == 3) {
                    temp[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }
    public static void main(String[] args) {

    }
}
