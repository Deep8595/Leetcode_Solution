class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length-2][grid[0].length-2];
        for(int i = 0; i < grid.length-2; i++){
            for(int j = 0 ; j < grid[0].length-2; j++){
                ans[i][j] = findMax(grid,i,j);
            }
        }
        return ans;
    }
    public int findMax(int[][] grid , int startRow , int startCol){
        int maxVal = Integer.MIN_VALUE;
        for(int i = startRow; i < startRow+3; i++){
            for(int j = startCol; j < startCol+3; j++){
                maxVal = Math.max(maxVal , grid[i][j]);
            }
        } 
        return maxVal;
    }
}