class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0 , sum = 0;
        int i ;
        for( i = 0 ; i < k ; i++) sum += nums[i];
        maxAvg = sum / k;
        while( i < nums.length){
            sum += nums[i] - nums[i-k];
            maxAvg = Math.max(maxAvg , sum/k);
            i++;
        }
        return maxAvg;
    }
}