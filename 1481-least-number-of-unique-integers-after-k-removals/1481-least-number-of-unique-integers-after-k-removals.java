class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> an : list) {
            if (k >= an.getValue()) {
                k -= an.getValue();
                map.remove(an.getKey());
            } else {
                break;
            }
        }
        return map.size();
    }
}