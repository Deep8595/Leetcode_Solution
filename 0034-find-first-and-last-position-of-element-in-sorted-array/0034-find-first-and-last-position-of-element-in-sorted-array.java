class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};
        int min = 0 , max = nums.length-1;
        while(min <= max){
            int mid = min + (max-min) / 2 ;
            if( nums[mid] == target){
                result = check(mid , nums , target);
                return result;
            }
            else if( nums[mid] > target){
                max = mid -1 ;
            }
            else{
                min = mid +1 ;
            }
        }
        return result;
    }
    public int[] check( int mid , int[] nums , int target){
        int left = mid , right = mid ;
        int result[] = {left , right};

        while( left >= 0 && nums[left] == target){
            result[0] = left;
            left--;
        }
        while( right <= nums.length-1 && nums[right] == target){
            result[1] = right;
            right++;
        }
        return result;
    }
}