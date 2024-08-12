package matrix;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // Chuyen ma tran ban dau thanh ma tran chuyen vi
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse tung hang trong ma tran chuyen vi
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - 1 - j];
                matrix[j][n - 1 - j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
