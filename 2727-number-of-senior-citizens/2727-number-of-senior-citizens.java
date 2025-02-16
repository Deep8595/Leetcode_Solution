class Solution {
    public int countSeniors(String[] details) {
        int i = 0, sum = 0;
        while( i < details.length){
            String detail = details[i];
            int age = Integer.parseInt(detail.substring(11,13));
            if( age > 60){
                sum++;
            }
            i++;
        }
        return sum;
    }
}