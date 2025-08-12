class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ls = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < index.length; i++){
            ls.add(index[i],nums[i]);
        }
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }
}