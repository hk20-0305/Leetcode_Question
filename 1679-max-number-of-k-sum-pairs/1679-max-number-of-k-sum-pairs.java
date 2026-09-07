class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int c = 0;
        int l = 0;
        int r = nums.length - 1;

        while (r > l) {
            int s = nums[l] + nums[r];

            if (s == k) {
                c++;
                l++;
                r--;
            } else if (s < k) {
                l++;
            } else {
                r--;
            }
        }

        return c;
    }
}