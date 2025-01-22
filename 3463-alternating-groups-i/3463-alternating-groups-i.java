class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        if (colors == null || colors.length == 0) {
            return 0; 
        }

        int groups = 0; 

        for (int i = 0; i < colors.length; i++) {
            if (colors[i] != colors[(i-1+n)%n] && colors[i] != colors[(i+1 + n)%n]) {
                groups++;
            }
        }

        return groups;
    }
}


