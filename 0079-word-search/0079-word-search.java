class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(search(board , word , i , j , m , n , 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(char[][] board , String word , int i , int j , int m , int n , int curr){
        if(curr >= word.length()) return true;
        if( i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(curr)) return false;
        boolean check = false;
        if(board[i][j] == word.charAt(curr)){
            board[i][j] += 100;
            check = 
            search(board , word , i +1 , j , m , n , curr+1) ||
            search(board , word , i , j + 1 , m , n , curr+1) ||
            search(board , word , i - 1 , j , m , n , curr+1) ||
            search(board , word , i , j - 1 , m , n , curr+1);
            board[i][j] -= 100;
        }
        return check;
    }
}