class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0 ) return 0;
        Arrays.sort(intervals , (a , b) -> a[1] - b[1]);
        int prev = 0 , count = 1;
        int n = intervals.length;
        for(int i = 0 ; i < n ; i++){
            if(intervals[i][0] >= intervals[prev][1]){
                prev = i;
                count++;
            }
        }
        return n - count;
    }
} 