class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {

        int[] arr = new int[dist.length];

        for (int i = 0; i < dist.length; i++) {
            arr[i] = (int) Math.ceil((double) dist[i] / speed[i]);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= i) {
                return i;
            }
        }

        return arr.length;
    }
}