class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length , left = 1 , right = 1;
        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = left ;
            left *= nums[i];
        }

        for(int i = n - 1 ; i >= 0 ; i--){
            arr[i] *= right;
            right *= nums[i];
        }

        return arr;
    }
}