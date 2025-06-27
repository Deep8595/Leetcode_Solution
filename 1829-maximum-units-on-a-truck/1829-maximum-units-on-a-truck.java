class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0 , step = 0 , left = 0;
        Arrays.sort(boxTypes , (a,b) -> b[1] - a[1]);
        for(int i = 0 ; i < boxTypes.length ; i++ ){
            step = boxTypes[i][0];
            if( step <= truckSize ){
                ans += step*boxTypes[i][1];
                truckSize -= step;
            }
            else{
                ans += truckSize * boxTypes[i][1];
                break;
            }
        }
        return ans;
    }
}