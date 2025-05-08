class Solution {
    public boolean canJump(int[] nums) {
        int ans = 0 , i = 0;
        while( i < nums.length ){
            if( i > ans ) return false;
            ans = Math.max( ans , i + nums[i]);
            i++;
        }
        return true;
    }
}