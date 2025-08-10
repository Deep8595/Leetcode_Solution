class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int cand : candies) {
            if(maxi < cand){
                maxi = cand;
            }
        }
        for(int i = 0 ; i < candies.length; i++){
            int sum = extraCandies + candies[i];
            if(sum >= maxi ){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}