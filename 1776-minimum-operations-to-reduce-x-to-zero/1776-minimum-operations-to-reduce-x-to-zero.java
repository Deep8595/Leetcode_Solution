class Solution {
    public int minOperations(int[] nums, int x) {
        x = -x;
        int totalSum = 0;
        for(int i = 0; i < nums.length ; i++){
            totalSum += nums[i];
        }
        x = totalSum + x;
        int start = 0;
        int end = 0;
        int ml =0;

        if( x < 0){
            return -1;
        }
        else if( x == 0){
            return nums.length;
        }

        while( end < nums.length){
            x = x - nums[end];

            while( x < 0){
                x += nums[start++];
            }
            if(x ==0){
                ml = Math.max( ml , end - start + 1);
            }
            end++;
        }
        return  ml == 0 ? -1 : nums.length - ml;
    }
}

