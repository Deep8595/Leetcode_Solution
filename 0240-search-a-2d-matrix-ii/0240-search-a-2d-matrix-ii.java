class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] arr = new int[m*n];
        int row = 0 , count = 0;
        for( int i = 0 ; i < m ; i++){
            for( int j = 0; j < n ; j++){
                arr[count++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        int min = 0 , max = arr.length-1;
        while( min <= max ){
            int mid = min + (max-min)/2;
            if( target == arr[mid]){
                return true;
            }
            else if( arr[mid] > target ){
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return false;
    }
}