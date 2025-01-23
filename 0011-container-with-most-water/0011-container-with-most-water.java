class Solution {
    public int maxArea(int[] height) {
        int start = 0 ;
        int end = height.length-1;
        int area = 0;

        while( end > start){
            int len = end - start;
            // area = len * (Math.min(height[start], height[end]));
            int currentArea = len * Math.min(height[start], height[end]);
            area = Math.max(area, currentArea);
            if(height[start] < height[end]){
                start++;
            }
            else {
                end--;
            }
        }
        return area;
    }
}