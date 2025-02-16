class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0, j = 0, result = 0;

        while (i < n) {
            int count = 0;
            int num = nums[i];
            while (num > 0) {
                num /= 10;
                count++;
            }
            if( count % 2 == 0){
                result++;
            }
            i++;
        }
        return result;
    }
}