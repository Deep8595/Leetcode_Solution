class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int j = 0, freq = 0, val = 0;
        for (int i = 0; i < nums.length; i+=2) {
            freq = nums[i];
            val = nums[i + 1];
            while (freq-- > 0) {
                ls.add(val);
            }
        }
        int[] arr = new int[ls.size()];
        while (j < arr.length) {
            arr[j] = ls.get(j);
            j++;
        }
        return arr;
    }
}