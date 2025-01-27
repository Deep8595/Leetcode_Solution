class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
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
        
        for(int k = 0 ; k < array.length ; k++){
            if( array[k] > 1){
                array[k] -= extra;
                array[k+1] += array[k];
                answer += array[k];
            }
        }
        return answer;
    }
}