class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        int i = 0 ;
        while(i < indices.length){
            res[indices[i]] = s.charAt(i);
            i++;
        }
        return new String(res);
    }
}