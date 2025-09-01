class Solution {
    public int fib(int n) {
        int[] arr = new int[n+1];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = -1;
        }
        return check( n , arr);
    }
    public int check(int n , int[] arr){
        if( n <= 1) return n;
        if(arr[n] != -1) return arr[n];
        arr[n] = check(n-1, arr) + check(n-2 , arr);
        return arr[n];
    }
}