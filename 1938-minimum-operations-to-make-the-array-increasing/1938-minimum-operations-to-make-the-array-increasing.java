class Solution {
    public int minOperations(int[] nums) {
        int i = 0 , count = 0;
        int n = nums.length;
        int [] arr = new int [n];

        // while( i < n-1){
        //     if(nums[i] == nums[i+1]){
        //         return n;
        //     }
        //     i++;
        // }

        while( i < n-1){
            int inc = 0;
            if(nums[i] > nums[i+1]){
                int number = nums[i+1];
                nums[i+1] = nums[i]+1;
                inc = nums[i+1] -  number;
                count += inc;
            }
            else if( nums[i] == nums[i+1]){
                int number = nums[i];
                nums[i+1] = nums[i] +1;
                inc = nums[i+1] - number;
                count += inc;
            }
            i++;
        }
        return count;
    }
}