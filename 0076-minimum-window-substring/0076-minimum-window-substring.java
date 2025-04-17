class Solution {
    public String minWindow(String s, String t) {

        String ans = "";

        HashMap<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }

        int match = 0;
        int desirematch = t.length();

        HashMap<Character, Integer> smap = new HashMap<>();

        int i = -1;
        int j = -1;

        while (true) {
            // acquire
            boolean f1 = false;
            boolean f2 = false;
            while (i < s.length() - 1 && match < desirematch) {
                i++;
                char ch = s.charAt(i);
                smap.put(ch, smap.getOrDefault(ch, 0) + 1);

                if (smap.getOrDefault(ch, 0) <= tmap.getOrDefault(ch, 0)) {
                    match++;
                }
                f1 = true;
            }

            // release and collect the answer;
            while (j < i && match == desirematch) {
                String pans = s.substring(j + 1, i + 1);
                if (ans.length() == 0 || pans.length() < ans.length()) {
                    ans = pans;
                }
                j++;
                char ch = s.charAt(j);
                if (smap.get(ch) == 1) {
                    smap.remove(ch);
                } else {
                    smap.put(ch, smap.get(ch) - 1);
                }
                if (smap.getOrDefault(ch, 0) < tmap.getOrDefault(ch, 0)) {
                    match--;
                }
                f2 = true;
            }
            if (f1 == false && f2 == false) {
                break;
            }
        }
        return ans;
    }
}