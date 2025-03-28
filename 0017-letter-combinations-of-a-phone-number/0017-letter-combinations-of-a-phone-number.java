class Solution {
    public List<String> letterCombinations(String digits) {
        if( digits.length() == 0){
            return new ArrayList<>();
        }
        return Answer(digits,0);
    }

    String[] code = {"" , "", "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};

    public List<String> Answer(String digits , int idx){
        if(idx == digits.length()){
            List<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        List<String> myResult = new ArrayList<>();
        List<String> recResult = Answer(digits, idx+1);

        char ch = digits.charAt(idx);  // 2 != '2' , 2 == '2' - '0'
        String codes = code[ch - '0']; // abc

        for(String recString : recResult){ //dg, dh , di , eg, eh , ei, fg, fh , fi;
            for( int i = 0 ; i < codes.length() ; i++){
                char chCode = codes.charAt(i);
                myResult.add(chCode + recString);
            }
        }
        return myResult;
    }
}