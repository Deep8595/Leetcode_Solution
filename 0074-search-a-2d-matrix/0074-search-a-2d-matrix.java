class Solution {
    private boolean canFind(int [][] matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int min = 0;
        int max = row * col -1;
        while (min <= max){
            int mid = min + (max - min)/ 2;
            int midValue = matrix[mid/col][mid % col];
            if(target > midValue){
                min = mid + 1;
            }
            else if(target < midValue){
                max = mid -1;
            }
            else {
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i = 0; i < matrix.length - 1; i ++){
        //     for(int j = 0 ; j < matrix[0].length -1 ; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        boolean result = canFind(matrix , target);
        return result;
    }
}