class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s == null ){
            return false;
        }
        s = s.toLowerCase();

        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                ans.append(c);
            }
        }
        
        char[] charArray = ans.toString().toCharArray();

        int start = 0 , end = ans.length() -1;

        while( start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}