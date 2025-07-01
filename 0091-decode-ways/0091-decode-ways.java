class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];

        if( s == null || n == 0 || s.charAt(0) == '0'){
            return 0;
        }
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            // check for single value 
            int one = s.charAt(i-1) - '0';
            if (one != 0) {
                dp[i] += dp[i - 1];
            }
            // checking for two digit checking
            int twodigit = Integer.parseInt(s.substring(i - 2, i));
            if (twodigit >= 10 && twodigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}