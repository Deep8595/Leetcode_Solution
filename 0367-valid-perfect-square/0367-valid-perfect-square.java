class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0 , r = num;

        if( num < 0 ) return false;

        while( l <= r ){
            long mid = l + ( r - l ) / 2;
            long sq = mid*mid;
            if( sq == num ) {
                return true;
            }
            else if( sq > num ){
                r = (int) mid - 1;
            }
            else{
                l = (int) mid + 1;
            }
        }
        return false;
    }
}