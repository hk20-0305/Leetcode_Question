class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {

        List<Boolean> ans = new ArrayList<>();

        for (String query : queries) {
            ans.add(match(query, pattern));
        }

        return ans;
    }

    public boolean match(String query, String pattern) {

        int j = 0;

        for (int i = 0; i < query.length(); i++) {

            char ch = query.charAt(i);
            if (j < pattern.length() && ch == pattern.charAt(j)) {
                j++;
            }
            else if (Character.isUpperCase(ch)) {
                return false;
            }
        }

        return j == pattern.length();
    }
}