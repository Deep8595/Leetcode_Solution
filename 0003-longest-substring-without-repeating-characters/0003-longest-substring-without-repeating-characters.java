class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int min = 0;
        int arr[] = new int[128];

        while( end < s.length()){
            
            arr[(int)(s.charAt(end))]++;
            

            while((arr[(int)s.charAt(end)]) > 1){
                arr[(int)(s.charAt(start))]--;
                start++;
            }

            min = Math.max(min , end - start +1);
            end++;
        }
        return min;
    }
}