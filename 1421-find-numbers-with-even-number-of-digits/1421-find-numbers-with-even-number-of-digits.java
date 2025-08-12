class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0 , i = 0;
        while( i < nums.length ){
            int check = nums[i];
            int count = 0;
            while( check > 0 ){
                check /= 10;
                count++;
            }
            if(count % 2 == 0){
                ans++;
            }
            i++;
        }
        return ans;
    }
}