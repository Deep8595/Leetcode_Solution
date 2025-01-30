class Solution {
    public int largestAltitude(int[] gain) {
       int n = gain.length;
       int gains[] = new int[n+1];
       gains[0] = gain[0];
       for(int i = 1 ; i < n  ; i++){
        gains[i] = gains[i-1] + gain[i];
       } 
       int max = gains[0];
       for(int i = 1 ; i < n + 1 ; i++){
        if(gains[i] > max ){
            max = gains[i];
        }
       }
       return max;
    }
}