class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix  = new int[n][n];
        int r1  = 0;
        int r2 = matrix.length -1;
        int c1 = 0;
        int c2  = matrix[0].length-1;
        int num = 1;

        while (r1 <= r2 && c1 <= c2){
            // left to right filled the matrix
            for(int c = c1 ; c <= c2 ; c++){
                matrix[r1][c] = num++;
            }

            // top to bottom filled the matrix
            for(int r = r1 +1 ; r <= r2  ; r++){
                matrix[r][c2] = num++;
            }

            if(r1<r2 && c1<c2){

            //  right to left till c[c2-1 to c1]
            for(int c = c2-1 ; c >= c1  ; c--){
                matrix[r2][c] = num++;
            }

            // bottom to top till r[r2 to r1-1]
            for(int r = r2-1 ; r > r1; r--){
                matrix[r][c1] = num++;
            }
            }

            r1++;
            c1++;
            r2--;
            c2--;
        }
        return matrix;
    }
}