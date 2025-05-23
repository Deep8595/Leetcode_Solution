class Solution {
    public int majorityElement(int[] nums) {
        int c = 0 , can = 0; 
        for( int num : nums){
            if(c == 0){
                can = num;
            }
            if( num == can){
                c++;
            }
            else{
                c--;
            }
        }
        return can ;
    }
}