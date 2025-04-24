class Solution {
    public int hammingWeight(int n) {
        int res = 0 , shift = 0 ;
        while( shift < 32 ){
            if((( n >> shift  ) & 1 ) == 1){
                res++;
            }
            shift++;
        }
        return res;
    }
}