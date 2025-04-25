class Solution {
    public int findKthLargest(int[] nums, int k) {
        // using sorting 
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}