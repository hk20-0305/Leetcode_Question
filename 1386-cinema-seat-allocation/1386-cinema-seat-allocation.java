class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < rs.length; i++) {
            map.putIfAbsent(rs[i][0], new ArrayList<>());
            map.get(rs[i][0]).add(rs[i][1]);
        }

        int c =(n-map.size())*2;
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            List<Integer> st = e.getValue();

            boolean l = rec(st, 2, 5);
            boolean m = rec(st, 4, 7);
            boolean r = rec(st, 6, 9);

            if (l && r) {
                c += 2;
            }else if (l || r || m){
                c += 1;
            }

        }

        return c;

    }

    public boolean rec(List<Integer> st, int s, int e) {
        boolean t = true;
        for (int i = s; i <= e; i++) {
            if (st.contains(i))
                t = false;
        }

        return t;
    }
}