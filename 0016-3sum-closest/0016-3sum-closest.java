class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mindiffernce = Integer.MAX_VALUE;
        int closestsum=0;
        int currdifference=0;
        for(int i = 0 ;i < nums.length -2 ; i++){
            int j = i+1;
            int k =nums.length-1;
            while( j < k){
                int sum = (nums[i] + nums[j] + nums[k]);
                int currdiffernce = Math.abs(target-sum);
                if(currdiffernce<mindiffernce){
                 mindiffernce =  currdiffernce;
                 closestsum = sum; 
                }  
                else if(sum  < target){
                    j++;
                }
                else if (sum > target){
                    k--;
                }
                else{
                    return sum;
                }
            }
        }
        return closestsum;
    }
}