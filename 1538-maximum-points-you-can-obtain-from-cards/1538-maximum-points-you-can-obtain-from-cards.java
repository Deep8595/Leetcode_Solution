class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // int start = 0 ;
        // int end = 0;
        // int arr[] = new int[cardPoints.length];
        int score = 0;
        for (int i = 0; i < k; i++) {
            score += cardPoints[i];
        }
        int maxScore=score;
        int end = cardPoints.length - 1;
        int start = k - 1;
        while (start >= 0) {
            score += (cardPoints[end] - cardPoints[start]);
            maxScore=Math.max(score,maxScore);
            end--;
            start--;
        }
        return maxScore;
    }
}