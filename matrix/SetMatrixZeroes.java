package matrix;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        boolean[] rowToZeroes = new boolean[rowSize];
        boolean[] colToZeroes = new boolean[colSize];

        for (int r = 0; r < rowSize; r++) {
            for (int c = 0; c < colSize; c++) {
                if(matrix[r][c] == 0) {
                    rowToZeroes[r] = true;
                    colToZeroes[c] = true;
                }
            }
        }

        for (int r = 0; r < rowSize; r++) {
            for (int c = 0; c < colSize; c++) {
                if(rowToZeroes[r] || colToZeroes[c]) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
