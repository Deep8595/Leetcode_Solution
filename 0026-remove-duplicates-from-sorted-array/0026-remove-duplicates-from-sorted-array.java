class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer , Boolean> has = new HashMap<>();
        List<Integer> lis = new ArrayList<>();

        for( int i : nums){
            if(!has.containsKey(i)){
                has.put(i , true);
                lis.add(i);
            }
        }
        for(int i = 0 ; i < lis.size() ; i++){
            nums[i] = lis.get(i);
        }

        return lis.size();

    }
}