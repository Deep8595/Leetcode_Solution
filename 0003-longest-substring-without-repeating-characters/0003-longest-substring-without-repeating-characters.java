class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int ans = 0 , start = 0 , end = 0;

        while( end < s.length()){
            char c = s.charAt(end);
            while(hash.contains(c)){
                hash.remove(s.charAt(start));
                start++;
            }
            hash.add(c);
            end++;
            ans = Math.max( ans , end - start );
        }
        return ans;
    }
}