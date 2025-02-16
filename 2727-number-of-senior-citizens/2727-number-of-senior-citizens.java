class Solution {
    public int countSeniors(String[] details) {
        int i = 0, sum = 0;
        for( String detail : details){
            int age = Integer.parseInt(detail.substring(11,13));
            if( age > 60){
                sum++;
            }
        }
        return sum;
    }
}