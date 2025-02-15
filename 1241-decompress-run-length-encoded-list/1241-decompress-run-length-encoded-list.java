class Solution {
    public int[] decompressRLElist(int[] nums) {
        // [freq, val] = [nums[2*i] , nums[2*i+1]]
        // i >= 0
        int rep = 0 , len = 0 , j = 0;
        for(int i = 0; i < nums.length; i = i+2){
            len += nums[i];
        }

        int[] newArr = new int[len];
        len = 0;
        // for(int i = 0 ; i < nums.length; i=i+2){
        while( j < nums.length){
            rep = nums[j];
            while(rep > 0){
                newArr[len] = nums[j+1];
                len++;
                rep--;
            }
            j = j+2;
        }
        return newArr;
    }
}