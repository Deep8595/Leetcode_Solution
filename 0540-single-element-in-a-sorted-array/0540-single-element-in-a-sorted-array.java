class Solution {
    public int singleNonDuplicate(int[] nums) {
        int min = 0 , max = nums.length - 1 , ans = 0;

        while( min <= max ){
            int mid = min + (max-min) / 2;
            if( mid == 0 || mid == nums.length - 1){
                ans = nums[mid];
                break;
            }
            int left = nums[mid-1];
            int right = nums[mid+1];
            if( nums[mid] != left && nums[mid] != right ){
                ans = nums[mid];
                break;
            }
            else if( (mid % 2 == 0 && nums[mid] == right) || (mid % 2 == 1 && nums[mid] == left)){
                min = mid +1;
            }
            else {
                max = mid -1;
            }
        }
        return ans;
    }
}