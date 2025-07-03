class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return check(nums , k ) - check (nums , k -1);
    }
    private int check (int nums[] , int k ){
        int i = 0 , res = 0 ;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] % 2 == 1) k--;
            while( k < 0){
                if(nums[i] % 2 == 1){
                    k++;
                }
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}