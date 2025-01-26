class Solution {
    public int trap(int[] height) {
        int i = 0 , j = height.length -1 , leftmax = 0 , rightmax  = 0;
        int tap = 0;
        while( i < j){
            if(height[i] < height[j]){
                if(height[i] >= leftmax){
                    leftmax = height[i];
                }
                else{
                    tap += leftmax - height[i];
                }
                i++;
            }
            else{
                if(height[j] >= rightmax){
                    rightmax = height[j];
                }
                else{
                    tap += rightmax - height[j];
                }
                j--;
            }
        }
        return tap;
    }
}