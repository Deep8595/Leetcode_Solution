class Solution {
    int longPalindrome = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        // a longPalindrome = a
        if( s.length() < 2 ) return s; 
        for( int i  = 0  ; i < s.length() -1 ; i++){
            // odd madam
            palindrome(s , i , i);
            // even abba
            palindrome( s, i , i+1);
        }
        return s.substring(longPalindrome ,  longPalindrome + maxLen);
    }
    void palindrome(String s , int start , int end){
        while( start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if( maxLen < (end - start -1)){
            longPalindrome = start + 1;
            maxLen = (end - start -1);
        }
    }
}