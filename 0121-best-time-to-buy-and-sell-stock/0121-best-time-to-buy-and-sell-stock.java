class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE , maxPrice = 0;
        for( int price : prices){
            if(minPrice > price){
                minPrice = price;
            }
            else if( maxPrice < price - minPrice ){
                maxPrice = price - minPrice; 
            }
        }
        return maxPrice;
    }
}