class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length +1];
        if( nums.length == 1 ) return nums[0];

        dp[0] = 0;
        dp[1] = nums[0];
        for( int i = 2 ; i < dp.length ; i++){
            dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i-1]);
        }

        return dp[dp.length-1];
    }
}