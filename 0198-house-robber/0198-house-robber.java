class Solution {
    public int rob(int[] nums) {
        if( nums.length == 1 ) return nums[0];
        int [] arr = new int [nums.length +1];
        arr[0] = 0;
        arr[1] = nums[0];
        for( int i = 2 ; i < arr.length ; i++ ){
            arr[i] = Math.max( (arr[i-1]) , (arr[i-2] + nums[i-1]));
        }
        return arr[arr.length-1];
    }
}