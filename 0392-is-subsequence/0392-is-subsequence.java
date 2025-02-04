class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0 , end = 0;

        while( end < t.length() && start < s.length()){
            if( s.charAt(start) == t.charAt(end) ){
                start++;
            }
            end++;
        }
        return start == s.length();
    }
}