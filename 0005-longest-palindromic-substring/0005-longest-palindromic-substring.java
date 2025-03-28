class Solution {
    int LongPalind = 0;
    int len = 0;
    public String longestPalindrome(String s) {
        if( s.length() < 2) return s;
        for( int i = 0 ; i < s.length() -1 ; i++){
            // odd 
            palindrome( s , i , i);
            // even 
            palindrome( s, i , i+1);
        }
        return s.substring(LongPalind , len + LongPalind);
    }
    void palindrome(String str , int start , int end){
        while( start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
        }
        if( len < (end - start -1)){
            LongPalind = start + 1;
            len = (end - start -1);
        }
    }
}