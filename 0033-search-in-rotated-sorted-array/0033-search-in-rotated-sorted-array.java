class Solution {
    public int search(int[] nums, int target) {
        int min = 0 , max = nums.length - 1;

        while( min <= max ){
            int mid = min + (max-min)/2;
            if( nums[mid] == target ){
                return mid;
            }
            if( nums[min] <= nums[mid]){
                if( nums[min] <= target && nums[mid] >= target){
                    max = mid-1;
                }
                else{
                    min = mid+1;
                }
            }
            else{
                if( nums[mid] <= target && nums[max] >= target){
                    min = mid +1;
                }
                else{
                    max = mid -1;
                }
            }
        }
        return -1;
    }
}