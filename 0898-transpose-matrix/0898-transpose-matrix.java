class Solution {
    public int[][] transpose(int[][] matrix) {
        int [][] result = new int[matrix[0].length][matrix.length];
        for(int i = 0; i <= matrix.length -1; i++){
            for(int j = 0; j <= matrix[0].length -1 ; j++){
                result[j][i] = matrix[i][j];    
            }
        }
        return result;
    }
}