class Solution {
    public int findNumbers(int[] nums) {
        int i = 0 , res = 0 ;

        while( i < nums.length){
            int num = nums[i];
            int count = 0;
            while( num > 0){
                num /= 10;
                count++;
            }
            if( count % 2 == 0){
                res++;
            }
            i++;
        }
        return res;
    }
}