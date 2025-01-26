class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] preSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                preSum[i][j] = mat[i - 1][j - 1] 
                             + preSum[i - 1][j] 
                             + preSum[i][j - 1] 
                             - preSum[i - 1][j - 1];
            }
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int row1 = Math.max(i - k, 0);
                int col1 = Math.max(j - k, 0);
                int row2 = Math.min(i + k, m - 1);
                int col2 = Math.min(j + k, n - 1);
                result[i][j] = preSum[row2 + 1][col2 + 1]
                             - preSum[row1][col2 + 1]
                             - preSum[row2 + 1][col1]
                             + preSum[row1][col1];
            }
        }
        
        return result;
    }
}
