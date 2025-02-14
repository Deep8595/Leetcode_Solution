class Solution {
    int result = 0;
    public int maximumValue(String[] strs) {
        for (String s : strs) {
            result = Math.max(result, res(s));
        }
        return result;
    }

    private int res(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                return word.length();
            }
        }
        return Integer.parseInt(word);
    }
}