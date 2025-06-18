class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i = 0 , five = 0 , ten = 0;
        while( i < bills.length ){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if( five > 0 ){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}