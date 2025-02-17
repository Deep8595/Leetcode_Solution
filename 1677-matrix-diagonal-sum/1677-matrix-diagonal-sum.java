class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0 , sum = 0;
        while(i < mat.length){
            sum += mat[i][i];
            if(i != mat[i].length - 1 - i){
                sum += mat[i][mat.length -i-1];
            }
            i++;
        }
        return sum;
    }
}