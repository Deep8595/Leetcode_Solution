class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length - 1, len = 0;
        while(left < right){
            int length = Math.min(height[left] , height[right]);
            int width = right - left;
            int area = length * width;
            if( area > len ){
                len = area;
            }
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return len;
    }
}