class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int product = 1;
            while (start < nums.length) {
                product *= nums[start];
                ans = Math.max(ans, product);
                start++;
            }
        }
        return ans;
    }
}
