class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length , m = matrix[0].length;
        int [] arr = new int [n*m] ;
        int count = 0;

        for( int i = 0 ; i < n ; i++ ){
            for( int j = 0 ; j < m ; j++){
                arr[count++] = matrix[i][j];
            }
        }
        for( int k = 0 ; k < arr.length ; k++ ){
            if( target == arr[k]){
                return true;
            }
        }
        return false;
    }
}