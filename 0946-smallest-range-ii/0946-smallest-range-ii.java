class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int result = nums[nums.length-1] - nums[0];
        int bestleft = nums[0] + k;
        int bestRight = nums[nums.length -1] - k;

        for(int i = 0 ; i < nums.length -1; i++){
            int maxVal = Math.max(bestRight , nums[i] +k);
            int minVal = Math.min(bestleft , nums[i+1] - k);
            result = Math.min(result, (maxVal - minVal));
        }
        return result;
    }
}