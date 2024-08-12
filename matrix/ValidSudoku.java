package matrix;

import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> columns = new HashSet<>();
            HashSet<Character> boxes = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.' && !rows.add(board[r][c]))
                    return false;
                if(board[c][r] != '.' && !columns.add(board[c][r]))
                    return false;
                int rowBox = 3 * (r / 3) + c / 3;
                int colBox = 3 * (r % 3) + c % 3;
                if(board[rowBox][colBox] != '.' && !boxes.add(board[rowBox][colBox]))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board));
    }
}
