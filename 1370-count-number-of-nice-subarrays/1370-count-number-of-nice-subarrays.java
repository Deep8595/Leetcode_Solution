class Solution {
    private static int canFind(int[] nums, int k) {

        int start = 0;
        int end = 0;
        int count = 0;

        while (end < nums.length) {
            if (nums[end] % 2 == 1) {
                k--;
                while (k < 0) {
                    if (nums[start] % 2 == 1) {
                        k++;
                    }
                    start++;
                }
            }
            count += end - start + 1;
            end++;
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        int count1 = canFind(nums, k);
        int count2 = canFind(nums, k - 1);
        int diff = count1 - count2;
        return diff;
    }
}