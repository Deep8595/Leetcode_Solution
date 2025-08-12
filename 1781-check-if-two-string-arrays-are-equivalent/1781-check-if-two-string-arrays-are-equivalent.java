class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1 = concate(word1);
        String ans2 = concate(word2);
        return ans1.equals(ans2);

    }

    private String concate(String[] letter) {
        return String.join("", letter);
    }
}