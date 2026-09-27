class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 1) return -1;
        Arrays.sort(nums);

        int num = -1;

        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                num = nums[i];
                break;
            }
        }

        return num;
    }
}