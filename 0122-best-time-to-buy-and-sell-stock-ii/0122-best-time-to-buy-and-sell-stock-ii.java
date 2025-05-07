class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1){
            return 0;
        }
        int min = prices[0] , ans = 0;
        for(int i = 0 ; i < prices.length - 1; i++){
            min = Math.min( min , prices[i]);
            int j = i+1;
            if( min < prices[j]){
                ans += prices[j] - min;
            }
            min = prices[j];
        }
        return ans;
    }
}