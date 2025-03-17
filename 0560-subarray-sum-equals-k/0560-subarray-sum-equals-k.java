class Solution {
    public int subarraySum(int[] nums, int k) {
        int i = 0 , count = 0;
        while( i < nums.length ){
            int sum = 0  , j = i;
            while( j < nums.length ){
                sum += nums[j];
                if( sum == k ){
                count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}