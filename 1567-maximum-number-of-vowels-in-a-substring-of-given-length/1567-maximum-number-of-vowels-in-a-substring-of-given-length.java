class Solution {
    public int maxVowels(String s, int k) {
        int maxcount = 0 , count = 0;
        for( int i = 0 ; i < s.length() ; i++ ){
            if(check(s.charAt(i))) count++;
            if( i >= k && check(s.charAt(i-k))) count--;
            if( i >= k -1 ) maxcount = Math.max( count , maxcount );
        }
        return  maxcount;
    }
    private boolean check( char c ){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}