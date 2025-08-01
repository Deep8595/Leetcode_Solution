class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1 , right = (int)1e6;
        int ans = -1;
        while( left <= right ){
            int mid = ( right - left ) / 2 + left;
            int sum = 0;
            for( int num : nums ){
                sum += (num + mid - 1) / mid ;
            }
            if( sum <= threshold){
                ans = mid ;
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}