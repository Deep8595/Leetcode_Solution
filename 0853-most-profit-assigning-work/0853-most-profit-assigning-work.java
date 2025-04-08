class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n =  difficulty.length;
        int [][] job = new int[n][2];

        for(int i = 0 ; i < n ; i++){
            job[i][0] = difficulty[i];
            job[i][1] = profit[i];
        }
        Arrays.sort(worker);
        Arrays.sort(job , (a,b) -> a[0] - b[0]);

        int max_pro = 0 , result = 0 , i =0;
        for(int w : worker){
            while( i < n && w >= job[i][0]){
                max_pro = Math.max(max_pro , job[i][1]);
                i++;
            }
            result += max_pro;
        }
        return result;
    }
}