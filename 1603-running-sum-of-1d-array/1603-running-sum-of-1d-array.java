class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
       int preffix[] = new int[n]; 
       preffix[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            preffix[i] = preffix[i - 1] + nums[i];
        }
        for(int i = 0 ; i < n ; i++){
            nums[i] = preffix[i]; 
        }
        return nums;
    }
}