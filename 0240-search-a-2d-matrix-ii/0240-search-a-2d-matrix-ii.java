class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length , n = matrix[0].length;
        int row = 0 , col = n-1 , step = 0;
        while( col >= 0 && row < m ){
            if( matrix[row][col] == target){
                step++;
                System.out.println(step);
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            } 
            else{
                col--;
            }
            step++;
        }
        return false;
    }
}