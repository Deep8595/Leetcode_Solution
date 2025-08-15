class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] arr = new int[r][c];
        int m = mat.length , n = mat[0].length;
        if( r*c != m *n ){
            return mat;
        }
        for(int i = 0 ; i < m*n; i++){
            arr[i/c][i%c] = mat[i/n][i%n];
        }
        return arr;
    }
}