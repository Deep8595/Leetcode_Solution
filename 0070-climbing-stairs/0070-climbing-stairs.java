class Solution {
    public int climbStairs(int n) {
        Map<Integer , Integer> climb = new HashMap<>();
        return climbStairs(n,climb);
    }
    private int climbStairs(int n , Map<Integer , Integer> climb){
        if(n == 0 || n == 1){
            return 1;
        }
        if( !climb.containsKey(n)){
            climb.put(n, climbStairs(n-1, climb) + climbStairs(n-2 , climb));
        }
        return climb.get(n);
    }
}