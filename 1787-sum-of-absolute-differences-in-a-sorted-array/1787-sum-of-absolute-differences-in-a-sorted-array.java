class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefix_sum = new int[n];
        int[] suffix_sum = new int[n];
        prefix_sum[0] = nums[0];
        suffix_sum[n-1] = nums[n-1];

        for(int i = 1 ; i < n ; i++){
            prefix_sum[i] = prefix_sum[i - 1] + nums[i];
            suffix_sum[n-i-1] = suffix_sum[n-i] + nums[n-i-1];
        }
        
        for(int i = 0 ; i < n; i++){
            int currAbsDiff= ((nums[i]*i) - prefix_sum[i]) + (suffix_sum[i] -(nums[i]*(n-i-1)));
            result[i] = currAbsDiff;
        }

        return result;
    }
}