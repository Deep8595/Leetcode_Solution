class Solution {
    public int candy(int[] ratings) {
        int [] arr = new int [ratings.length];
        for( int i = 0 ; i < arr.length ; i++){
            arr[i] = 1;
        }

        // left to right 

        for( int i = 1 ; i < arr.length ; i++ ){
            if(ratings[i] > ratings[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }

        // right to left and compare find max at a time

        for( int i = ratings.length-2 ; i >= 0 ; i-- ){
            if(ratings[i] > ratings[i+1]){
                arr[i] = Math.max(arr[i] , arr[i+1] +1);
            }
        }

        // calcutae the total 
        int ans = 0;
        for(int a : arr){
            ans += a;
        }

        // answer return 
        return ans;
    }
}