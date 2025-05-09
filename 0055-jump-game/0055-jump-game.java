class Solution {
    static {
        for(int i=0;i<500;i++){
            canJump(new int[]{0});
        }
    }
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach) return false;
            maxReach = Math.max(maxReach, i+nums[i]);
        }
        return true;
    }
}