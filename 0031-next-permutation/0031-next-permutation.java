class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int g = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                g = i - 1;
                break;
            }
        }

        if (g == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int s = -1;
        for (int i = n - 1; i > g; i--) {
            if (nums[i] > nums[g]) {
                s = i;
                break;
            }
        }

        swap(nums, g, s);

        reverse(nums, g + 1, n - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}