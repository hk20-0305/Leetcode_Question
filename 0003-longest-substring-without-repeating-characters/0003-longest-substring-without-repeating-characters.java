class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            while (set.contains(ch)) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(ch);
            max = Math.max(max, set.size());
        }

        return max;
    }
}