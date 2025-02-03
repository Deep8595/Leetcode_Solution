class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <=1){
            return 0;
        }
        int max = 0 , i = 0 , min = prices[0];
        for(i = 0 ; i < prices.length; i++){
            int profit = prices[i] - min;
            max = Math.max(max , profit);
            min = Math.min(min , prices[i]);
        }
        
        return max;
    }
}