class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0 , i = 0 ;
        while( i < grid.length ){
            int j = 0;
            while( j < grid[i].length ){
                if(grid[i][j] < 0){
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}