class Solution {
    public int minimumDeletions(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        int f1 = 0;
        int f2 = 0;
        int e1 = 0;
        int e2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max == nums[i] && f1 == 0) {
                f1 = i + 1;
            }

            if (min == nums[i] && f2 == 0) {
                f2 = i + 1;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (max == nums[i] && e1 == 0) {
                e1 = nums.length - i;
            }

            if (min == nums[i] && e2 == 0) {
                e2 = nums.length - i;
            }
        }

        int rs1 = Math.max(f1, f2);
        int rs2 = Math.max(e1, e2);
        int rs3 = f1 + e2;
        int rs4 = f2 + e1;

        return Math.min(
                Math.min(rs1, rs2),
                Math.min(rs3, rs4)
        );
    }
}