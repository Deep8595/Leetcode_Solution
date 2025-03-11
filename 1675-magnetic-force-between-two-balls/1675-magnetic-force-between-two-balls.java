class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min = 1 ;
        int max = position[position.length-1] - position[0];
    
        while( min <= max){
            int temp =  m -1;
            int mid = (max + min) / 2;
            int last_position = position[0];
           for(int i = 0 ;i < position.length; i++){
            if(position[i] - last_position >= mid){
                --temp;
                last_position = position[i];
            }
           }
            if( temp > 0 ){
                max  = mid -1;
            }
            else {
                min = mid +1;
            }
        }
        return max;
    }
}

