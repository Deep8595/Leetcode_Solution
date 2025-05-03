class Solution {
    public int[] searchRange(int[] nums, int target) {
        int empty[] = {-1,-1};
        if( nums.length == 0 ) return empty;

        int start = -1 , end = -1 ;
        for( int i = 0 ;i < nums.length ; i++){
            if( nums[i] == target ){
                start = i;
                break;
            }
        }

        if( start == -1 ) return empty;

        for( int i = start + 1 ; i < nums.length ; i++){
            if( nums[i] == target ) {
                end = i;
            }
        }
        if( end == -1 ) return new int[] {start, start};

        return new int[]{start , end};
    }
}