class Solution {
    public int maximumWealth(int[][] accounts) {
        int i = 0, find = 0;
        while (i < accounts.length) {
            int sum = 0 , j = 0;
            while (j < accounts[i].length) {
                sum =  sum + accounts[i][j];
                j++;
            }
            find = Integer.max(find, sum);
            i++;
        }
        return find;
    }
}