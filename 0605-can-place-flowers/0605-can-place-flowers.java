class Solution {
    public boolean canPlaceFlowers(int[] flow, int n) {
        int s = -1, l = 0, r = 0;
        for (int i = 0; i < flow.length; i++) {
            if (flow[i] == 0) {
                s = i;
                l = ( i == 0 ) ? 0 : flow[i-1];
                r = ( i == flow.length - 1) ? 0 : flow[i+1];
                if (l == 0 && r == 0) {
                    flow[i] = 1;
                    n--;
                   if(n == 0) return true;
                }
            }
        }
        return n <= 0 ;
    }
}