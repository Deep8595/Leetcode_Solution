class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for( int[] row : grid ){
            ans = ans + findneg( row );
        }
        return ans;
    }
    public int findneg( int [] arr ){
        int start = 0;
        int end = arr.length-1;
        int count = 0;
        if(arr[start] < 0){
            count = arr.length;
            return count;
        }
        while( start <= end ){
            int mid = (end - start) / 2 + start;
            if( arr[mid] >= 0 ){
                start = mid +1;
            }else if(arr[mid-1] < 0 ){
                end = mid -1;
            }else{
                count = arr.length - mid;
                return count;
            }
        }
        return count;
    }
}