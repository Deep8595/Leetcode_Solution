class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        partitionHelper(s, 0 , new ArrayList<>() , ans);
        return ans;
    }

    private void partitionHelper(String s , int start , List<String> current , List<List<String>> ans ){
        if(start == s.length()){
            ans.add(new ArrayList<>(current));
            return ;
        }
        for( int i = start ; i < s.length() ; i++){
            String pre = s.substring(start , i+1);
            if(ispalindrome(pre)){
                current.add(pre);
                partitionHelper(s , i+1 , current , ans);
                current.remove(current.size() -1);
            }
        }
    }

    private boolean ispalindrome(String str ){
        int left = 0 , right = str.length() -1;
        while( left < right ){
            char li = str.charAt(left);
            char ri = str.charAt(right);
            if( li != ri ){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}