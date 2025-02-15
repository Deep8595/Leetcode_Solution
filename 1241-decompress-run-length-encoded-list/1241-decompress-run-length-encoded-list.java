class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0 , j = 0 , rep = 0 , start = 0;
        for(int i = 0 ; i < nums.length ; i=i+2){
            len += nums[i];
        }
        int [] newArr = new int[len];
        while(j < nums.length){
            rep = nums[j];
            while( rep > 0){
                newArr[start] = nums[j+1];
                start++;
                rep--;
            }
            j = j+2;
        }
        return newArr;
    }
}