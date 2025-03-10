class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0 , total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (left == total - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
