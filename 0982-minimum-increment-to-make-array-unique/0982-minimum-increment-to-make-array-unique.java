class Solution {
    public int minIncrementForUnique(int[] nums) {
        int extra = 1;
        int answer = 0;
        int max = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int n = nums.length + max;
        int array[] = new  int[n];

        for(int i = 0 ; i < nums.length; i++){
            array[nums[i]]++;
        }
        for(int i = 0 ; i < array.length ; i++){
            if( array[i] > 1){
                array[i] = array[i] - extra;
                array[i+1] = array[i+1] + array[i];
                answer = answer + array[i];
            }
        }
        return answer;
    }
}