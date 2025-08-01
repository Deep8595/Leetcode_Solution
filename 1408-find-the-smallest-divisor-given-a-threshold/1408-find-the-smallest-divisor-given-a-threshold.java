class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1 , ans = -1 , right = 0;
        for(int n : nums){
            right = Math.max(n , right);
        }

        while( left <= right ){
            int mid = left + (right - left) / 2;
            int sum = 0;
            for(int num : nums){
                sum += (num + mid -1) / mid;
            }
            if(sum <= threshold){
                ans = mid;
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}