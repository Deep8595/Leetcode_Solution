class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int comp = 0;
        List<Boolean> bool = new ArrayList<>();

        for(int candy : candies){
            comp = Math.max(comp , candy);
        }
        for(int i = 0 ; i < candies.length; i++){
            if( extraCandies + candies[i] >= comp ){
                bool.add(true);
            }else{
            bool.add(false);
            }
        }
        return bool;
    }
}