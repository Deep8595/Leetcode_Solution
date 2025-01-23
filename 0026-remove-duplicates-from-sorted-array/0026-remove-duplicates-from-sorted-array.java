
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle empty array case
        
        int k = 1; // Pointer for placing unique elements
        
        // Iterate from the second element to the end
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Place the unique element at position k
                k++; // Move the pointer
            }
        }
        
        return k; // The number of unique elements
    }
}
