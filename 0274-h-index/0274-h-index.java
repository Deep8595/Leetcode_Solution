class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int [] arr = new int [citations.length +1];
        int answer = 0;
        for(int i = 0 ;i < citations.length ; i++){
            int h = citations.length - i;
            if( h <= citations[i] ){
                answer = h;
                break;
            }
        }
        return answer;
    }
}