class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col = 0, row = 0;
        while (col < n && row < m) {
            if (target > matrix[row][n - 1]) {
                row++;
            } else if (target == matrix[row][n - 1]) {
                return true;
            } else if (target < matrix[row][n - 1]) {
                int min = 0;
                int max = n - 1;
                while (min <= max) {
                    int midf = min + (max - min) / 2;
                    int mid = matrix[row][midf];
                    if (mid == target) {
                        return true;
                    } else if (target > mid) {
                        min = midf + 1;
                    } else {
                        max = midf - 1;
                    }
                }
                return false;
            }
        }
        return false;
    }
}