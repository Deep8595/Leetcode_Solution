class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0 , totalSum = 0;
        for( int i = 0 ; i < nums.length ; i++ ){
            sum += nums[i];
            totalSum = Math.min( sum , totalSum);
        }
        return 1 - totalSum;
    }
}