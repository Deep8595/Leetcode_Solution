class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        int ans = 0;
        Arrays.sort(worker);
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        int[] count = new int[jobs[jobs.length - 1][0] + 1];
        int m = count.length, j = 0;
        count[0] = 0;
        int best = 0;

        for (int i = 1; i < m; i++) {
            while (j < jobs.length && jobs[j][0] == i) {
                best = Math.max(best, jobs[j][1]);
                j++;
            }
            count[i] = Math.max(count[i - 1], best);
        }

        for (int w = 0; w < worker.length; w++) {
            if (worker[w] < m) {
                ans += count[worker[w]];
            } else {
                ans += count[m - 1];
            }
        }

        return ans;
    }
}
