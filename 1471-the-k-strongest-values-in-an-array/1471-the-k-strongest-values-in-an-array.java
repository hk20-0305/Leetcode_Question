class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        int m = arr[e/2];
        int[] r = new int[k];
        while(s <= e && k > 0) {
            if(Math.abs(arr[e] - m) >= Math.abs(arr[s] - m)) {
                r[r.length - k] = arr[e];
                e--;
            } else {
                r[r.length - k] = arr[s];
                s++;
            }
            k--;
        }
        return r;
    }
}