class Solution {
    public String reverseParentheses(String s) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                l1.add(i);

            if (s.charAt(i) == ')')
                l2.add(i);
        }

        int k = l1.size();
        boolean[] used = new boolean[l2.size()];

        StringBuilder sb = new StringBuilder(s);

        while (k > 0) {

            int open = l1.get(k - 1);

            for (int x = 0; x < l2.size(); x++) {

                if (!used[x] && l2.get(x) > open) {

                    rec(sb, open + 1, l2.get(x) - 1);

                    used[x] = true;
                    break;
                }
            }

            k--;
        }

        return sb.toString().replaceAll("[()]", "");
    }

    public void rec(StringBuilder st, int i, int j) {

        while (i < j) {
            char ch = st.charAt(i);

            st.setCharAt(i, st.charAt(j));
            st.setCharAt(j, ch);

            i++;
            j--;
        }
    }
}