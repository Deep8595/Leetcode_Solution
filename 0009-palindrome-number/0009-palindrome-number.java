class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }

        int  rev = 0 , var = x;

        while( var != 0){
            int dig = (int) (var % 10);
            rev = rev * 10 + dig;
            var /= 10;
        }
        return (rev == x);
    }
}