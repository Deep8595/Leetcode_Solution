class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int [] arr = new int[101];
        for(int i : nums){
            if(arr[i]++ >= 2)
                return false;
        }
        return true;
    }
}