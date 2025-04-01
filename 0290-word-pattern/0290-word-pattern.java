class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patternArr = pattern.toCharArray();
        String[] strArr = s.split(" ");

        if(strArr.length != patternArr.length) return false;

        for( int i = 0 ; i < strArr.length; i++ ){
            for(int j = i+1 ; j < strArr.length; j++){
                if(patternArr[i] == patternArr[j] && !strArr[i].equals(strArr[j])){
                    return false;
                }
                if(patternArr[i] != patternArr[j] && strArr[i].equals(strArr[j])){
                    return false;
                }
            }
        }
         return true;
    }
}