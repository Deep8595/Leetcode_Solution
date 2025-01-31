class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }

        long rev = 0;
        long var = x;

        while( var != 0){
            int dig = (int) (var % 10);
            rev = rev * 10 + dig;
            var /= 10;
        }
        return (rev == x);
    }
}