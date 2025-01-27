class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int start = 0;
        int end = tokens.length - 1;
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);
        while (start <= end) {

            if (tokens[start] <= power) {
                power -= tokens[start];
                score++;
                start++;
                maxScore = Math.max(score, maxScore);
            } else if (score > 0) {
                power += tokens[end];
                score--;
                end--;
            } else
                break;
        }
        return maxScore;
    }
}