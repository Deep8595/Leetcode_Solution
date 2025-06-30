class Solution {
    public int rob(int[] nums) {
        int n = nums.length ; 
        if(n == 0) return 0;
        if(n == 1) return nums[0];

        int[] rub = new int[n];

        rub[0] = nums[0];
        rub[1] = Math.max(nums[0] , nums[1]);

        for(int i = 2 ; i < n ; i++){
            rub[i] = Math.max(rub[i-1] ,  nums[i] + rub[i-2]);
        }
        return rub[n-1];
    }
}