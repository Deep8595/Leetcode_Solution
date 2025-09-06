class Solution {
    public int deleteAndEarn(int[] nums) {
        if( nums.length == 1 ) return nums[0];
        int maxfind = nums[0];
        for(int i = 1 ; i < nums.length; i++){
            if( maxfind < nums[i]) maxfind = nums[i];
        }
        int sum [] = new int[maxfind+1];
        for(int num : nums){
            sum[num] += num;
        }
        int dp [] = new int[maxfind+1];
        dp[1] = sum[1];
        for(int i = 2 ; i < maxfind+1 ; i++){
            dp[i] = Math.max(dp[i-2] + sum[i] , dp[i-1]);
        }
        return dp[maxfind];
    }
}