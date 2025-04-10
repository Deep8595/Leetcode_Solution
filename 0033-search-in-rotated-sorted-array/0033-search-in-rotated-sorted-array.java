class Solution {
    public int search(int[] A, int tar) {
        int min = 0 , max = A.length-1;

        while( min <= max ){
            int mid = min + ( max - min)/2;
            if( A[mid] == tar){
                return mid;
            }

            if( A[min] <= A[mid]){
                // left sorted
                if( A[min] <= tar && tar <= A[mid]){
                    max = mid -1;
                }else{
                    min = mid + 1;
                }
            }
            else {
                // right sorted
                if( A[mid] <= tar && tar <= A[max]){
                    min = mid +1;
                }
                else{
                    max = mid -1;
                }
            }
        }
        return -1;
    }
}