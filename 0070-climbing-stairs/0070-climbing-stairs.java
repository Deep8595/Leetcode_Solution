class Solution {
    public int climbStairs(int n) {
        int [] arr = new int[n+1];
        for( int i = 0 ; i <= n ; i++){
            arr[i] = -1;
        }
        return memo( n , arr );
    }
    private int memo(int n , int[] arr){
        if( n <= 1 ) return 1;
        if( arr[n] != -1 ) return arr[n];
        arr[n] = memo( n -1 , arr ) + memo( n-2 , arr);
        return arr[n];
    }
}