class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        int minZero = 0;
        for(int i = 0 ; i < nums.length ;i++){
            count += nums[i];
        }

        for(int i = 0 ; i < count ; i++){
            if(nums[i] == 0){
                minZero++;
            }
        }

        int min = minZero;
        int start = 0;
        int end = count -1;

        while ( start < nums.length){
            if(nums[start] == 0){
                minZero--;
            }
            start++;
            end++;
            if( nums[end%nums.length] == 0) {
                minZero++;
            }
                min =  Math.min( minZero , min);
        }
        return min;
    }
}