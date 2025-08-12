class Solution {
    public int minOperations(int[] nums) {
        int ans = 0 , i = 0;
        while( i < nums.length-1 ){
            int check = nums[i];
            while( check >= nums[i+1]){
                nums[i+1] = nums[i+1] + 1;
                ans++;
            }
            i++;
        }
        return ans;
    }
}