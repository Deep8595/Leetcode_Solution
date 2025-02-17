class Solution {
    public int countNegatives(int[][] grid) {
        int i = 0 , count = 0;

        while( i < grid.length){
            int j = 0;
            while( j < grid[i].length){
                if( grid[i][j] < 0 ){
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}