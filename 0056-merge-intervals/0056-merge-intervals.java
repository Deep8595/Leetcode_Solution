class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (interval1, interval2) -> interval1[0] - interval2[0]);

        int i = 0, j = 1;
        int end = intervals[0][1];
        List<int[]> answer = new ArrayList<>();
        while (j < intervals.length && i < j) {
            if (intervals[j][0] <= end) {
                end = Math.max(intervals[j][1], end);
            } 
            else {
                int[] ans = { intervals[i][0], end };
                answer.add(ans);
                i = j;
                end = Math.max(intervals[j][1], end);
            }
            j++;
        }
        int[] ans = { intervals[i][0], end };
        answer.add(ans);
        return answer.toArray(new int[answer.size()][]);
    }
}