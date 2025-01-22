class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int start = 0;
        int end = 1;
        int count = 0; // store the n value in this
        int answer = 0; // store the 2n value in this

        while (end <2 *  colors.length) {
                if (colors[(end)%n] != colors[(end - 1) % n] ) {
                    if(end - start +1 >= k){
                        count++;
                    }  
                }
                else{
                        start = end  ;
                    }
                end++;
            }
            end = 1 ;
            start = 0 ; 
            while (end <  colors.length) {
                if (colors[(end)%n] != colors[(end - 1) % n] ) {
                    if(end - start +1 >= k){
                        answer++;
                    }  
                }
                else{
                        start = end  ;
                    }
                end++;
            }
        return count - answer;
    }
}