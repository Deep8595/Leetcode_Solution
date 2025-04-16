class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        for( int i = 0 ; i < nums.length ; i++){
            hash.put(nums[i] , i );
        }
        for( int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            int remain = target - num;
            if( hash.containsKey(remain)){
                int index = hash.get(remain);
                if( index == i) continue;
                return new int[]{i , index};
            }
        }
        return new int[] {};
    }
}