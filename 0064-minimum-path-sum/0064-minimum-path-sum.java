class Solution {
    public int minPathSum(int[][] grid) {
        int [][] dp = new int[grid.length][grid[0].length];
        for(int a[] : dp){
            Arrays.fill(a , -1);
        }
        return find( grid , 0 , 0 , dp);
    }
    public int find(int grid[][] , int i , int j , int dp[][]){
        if( i == grid.length-1 && j == grid[0].length-1 ){
            return grid[i][j];
        }
        if( i >= grid.length || j >= grid[0].length ){
            return Integer.MAX_VALUE;
        }
        if( dp[i][j] != -1 ){
            return dp[i][j];
        }
        int down = find(grid , i+1 , j , dp);
        int right = find(grid , i , j+1 , dp);
        return dp[i][j] = Math.min(down , right) + grid[i][j];
    }
}