class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int l = 0, sum = 0;
        int ans = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        int[] best = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            best[i]=Integer.MAX_VALUE;
        }

        for (int r = 0; r < arr.length; r++) {

            sum += arr[r];

            while (sum > target)
                sum -= arr[l++];

            if (r > 0)
                best[r] = best[r - 1];

            if (sum == target) {

                int len = r - l + 1;

                if (l > 0 && best[l - 1] != Integer.MAX_VALUE)
                    ans = Math.min(ans, len + best[l - 1]);

                min = Math.min(min, len);
                best[r] = min;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}