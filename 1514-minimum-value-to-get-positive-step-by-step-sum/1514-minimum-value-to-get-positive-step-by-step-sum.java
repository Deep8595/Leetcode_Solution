class Solution {
    public int minStartValue(int[] nums) {
        int pref = 0;
        int sum = 0 ;

        for(int arr : nums){
            sum += arr;
            pref = Math.min(sum,pref);
        }
        return 1 - pref;
    }
}