class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                num += nums[i];
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        for (int numss : nums) {
            if (numss == num) {
                num++;
            }
        }
        return num;
    }
}