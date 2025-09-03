class Solution {
    public int tribonacci(int n) {
        int[] arr = new int[n+1];
        for(int i = 0 ; i < n + 1 ; i++){
            arr[i] = -1;
        }
        return check( n , arr);
    }
    public int check(int n , int[] arr){
        if( n == 0 ) return 0;
        if( n == 1 || n == 2 ) return 1;
        if ( arr[n] != -1 ) return arr[n];
        arr[n] = check(n-1, arr) + check(n-2, arr) + check(n-3, arr);
        return arr[n];
    }
}
