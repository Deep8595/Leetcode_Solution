class Solution {
    public int[] countBits(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int count = 0, x = i;
            while( x > 0){
                count += ( x & 1);
                x = x >> 1;
            }
            ans.add(count);
        }
        int [] res = new int[ans.size()];
        for( int i = 0 ; i < ans.size() ; i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}