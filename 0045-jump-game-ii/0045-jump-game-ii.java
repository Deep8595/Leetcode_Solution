class Solution {
    public int jump(int[] nums) {
        int reach = 0, ans = 0;
        if( nums.length == 1) return ans;
        for(int i=0 ; i < nums.length ; i++){
            if( reach == i){
                ans ++;
            }
            reach = Math.max(reach , i+nums[i]);
        }
        return  ans;
    }
}