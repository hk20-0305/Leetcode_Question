class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int i = 0;

        while (i < nums.length) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int m = 0; m <= i; m++) {
                max = Math.max(max, nums[m]);
            }

            for (int m = i; m < nums.length; m++) {
                min = Math.min(min, nums[m]);
            }

            int sum = max - min;

            if (sum <= k) {
                return i;
            }

            i++;
        }

        return -1;
    }
}