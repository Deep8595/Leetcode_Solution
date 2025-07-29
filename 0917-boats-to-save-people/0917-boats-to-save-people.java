class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int bone = 0;
        int lid = 0;
        int heavy = people.length-1;
        while( lid <= heavy ){
            if(people[lid] + people[heavy] <= limit){
                lid++;
            }
            heavy--;
            bone++;
        }
        return bone;
    }
}