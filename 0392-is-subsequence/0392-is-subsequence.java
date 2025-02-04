class Solution {
    public boolean isSubsequence(String s, String t) {
        int S = 0 , e = 0;

        while ( e < t.length() && S < s.length()){
            if(s.charAt(S) == t.charAt(e)){
                S++;
            }
            e++;
        }
        
        return S == s.length();
    }
}