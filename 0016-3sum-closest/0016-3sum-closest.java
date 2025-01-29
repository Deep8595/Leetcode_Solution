class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        int closeSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = nums.length - 1;
            int j = i + 1;
            while (j < k) {
                sum = (nums[i] + nums[j] + nums[k]);
                if (Math.abs(sum - target) < Math.abs(closeSum - target)) {
                    closeSum = sum;
                } else if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    return sum;
                }
            }
        }
        return closeSum;
    }
}