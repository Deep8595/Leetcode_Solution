class Solution {
    public double myPow(double x, int n) {
        long pos = n;
        if( pos < 0 ){
            pos = - pos;
            x = 1 / x;
        }
        double ans = 1.0;
        while( pos > 0 ){
            if( (pos % 2) == 1 ){
                ans *= x;
            }
            x = x * x;
            pos = pos / 2;
        }
        return ans;
    }
}