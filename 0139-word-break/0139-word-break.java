class Solution {
    Boolean[] dp;
    private boolean help(int i , String s , Set<String> word){
        if (i == s.length()) return true;
        if (dp[i] != null) return dp[i]; 
        StringBuilder temps = new StringBuilder();
        for(int j = i ; j < s.length(); j++){
            temps.append(s.charAt(j));
            String temp = temps.toString();
            if(word.contains(temp) ){
                if(help(j+1 , s , word)) return dp[i] = true;
            }
        }
        return dp[i] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> st = new HashSet<>(wordDict);
        dp = new Boolean[s.length()+1];
        return help(0, s , st);
    }
}