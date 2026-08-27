class Solution {
    public String longestPalindrome(String s) {

        if (s.length() == 0) return "";

        String ans = s.substring(0, 1);

        int l = 0;

        while (l < s.length()) {
            int r = l + 1;

            while (r < s.length()) {
                String curr = s.substring(l, r + 1);

                if (rec(curr) && ans.length() < curr.length()) {
                    ans = curr;
                }

                r++;
            }

            l++;
        }

        return ans;
    }

    public boolean rec(String str) {
        int l = 0;
        int r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}