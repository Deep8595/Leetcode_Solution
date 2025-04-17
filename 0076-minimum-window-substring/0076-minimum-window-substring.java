class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] targetFreq = new int[128];
        int[] windowFreq = new int[128];

        // Fill frequency of characters in t
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }

        int required = 0;
        for (int freq : targetFreq) {
            if (freq > 0) required++;
        }

        int formed = 0;
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowFreq[c]++;

            // Check if current character completes one required char
            if (targetFreq[c] > 0 && windowFreq[c] == targetFreq[c]) {
                formed++;
            }

            // Try to shrink the window from the left
            while (left <= right && formed == required) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }

                char lc = s.charAt(left);
                windowFreq[lc]--;

                if (targetFreq[lc] > 0 && windowFreq[lc] < targetFreq[lc]) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}
