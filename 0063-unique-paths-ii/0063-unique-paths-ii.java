class Solution {
    public int uniquePathsWithObstacles(int[][] find) {
        return dfs(
            find,
            0 , 0 , 
            find.length , find[0].length,
            new int[find.length][find[0].length]
        );
    }
    public int dfs(int[][] find , int i , int j , int m , int n , int[][] dp){
        if( i < 0 || j < 0 || i >= m || j >= n || find[i][j] == 1 ){
            return 0;
        }
        if( i == m - 1 && j == n - 1 ){
            dp[i][j] = 1;
            return dp[i][j] ;
        }
        if( dp[i][j] != 0 ) return dp[i][j];
        int right = dfs(find , i , j+1 , m , n , dp);
        int left = dfs(find , i+1 , j , m , n , dp);
        dp[i][j] = right + left ;
        return dp[i][j] ;
    }
}