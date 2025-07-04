class Solution {
    public void sortColors(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        }

        int i = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();
            while(value >0){
                nums[i++] = key;
                value--;
            }
        }

    }
}