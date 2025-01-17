class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0;
        int end = 0; 
        int maxUn = 0;
        int Un = 0;
        while (end < customers.length){
            if(grumpy[end] == 1){
            Un += customers[end];
            }

            while( end - start >=  minutes){
                if(grumpy[start] == 1){
                Un -= customers[start];
                }
                start++;
            }
            maxUn = Math.max(maxUn , Un);
            end++;
        }
        for(int i = 0 ;  i < customers.length; i++){
            if(grumpy[i] == 0){
                maxUn += customers[i];
            }
        }
        return maxUn;
    }
}