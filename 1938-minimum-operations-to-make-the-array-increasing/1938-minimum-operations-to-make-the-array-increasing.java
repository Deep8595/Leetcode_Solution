class Solution {
    public int minOperations(int[] nums) {
        int i = 0 , count = 0;
        while( i < nums.length-1){
            int inc = 0;
            if(nums[i] >= nums[i+1]){
                int number = nums[i+1];
                nums[i+1] = nums[i]+1;
                inc = nums[i+1] -  number;
                count += inc;
            }
            i++;
        }
        return count;
    }
}