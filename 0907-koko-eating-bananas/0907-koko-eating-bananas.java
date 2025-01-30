class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        
        // Find the largest pile to set the max boundary
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        
        // Perform binary search
        while (min < max) {
            int mid = min + (max - min) / 2;
            int sum = 0;
            
            // Calculate the total hours required to eat at speed `mid`
            for (int pile : piles) {
                sum += (pile + mid - 1) / mid; // Equivalent to ceiling(pile / mid)
            }
            
            // If the total hours exceeds h, we need a faster speed (increase min)
            if (sum > h) {
                min = mid + 1;
            } else {
                max = mid; // We can slow down (reduce max)
            }
        }
        
        return min; // min will be the minimum eating speed to finish within h hours
    }
}
