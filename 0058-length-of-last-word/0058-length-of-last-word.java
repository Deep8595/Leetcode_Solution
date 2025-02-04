class Solution {
    public int lengthOfLastWord(String s) {
        // int count = 0 ,  start = s.length() , end = s.length();
        // for ( int i = start ; i > start ; i--){
        //     if( s.charAt(i) != ' '){
        //         count++;
        //     }
        // }
        // return count;
        int end = s.length() -1 ;
        while ( end >= 0 && s.charAt(end) == ' ' ){
            end--;
        }
        int start = end;
        while( start >= 0 && s.charAt(start) != ' '){
            start--;
        }
        return end - start;
    }
}