class Solution {
    public int maxSum(int[] nums) {

        HashSet<Integer> ans = new HashSet<>();

        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]>0 && !ans.contains(nums[i])){
                ans.add(nums[i]);
                sum+=nums[i];
            }
        }

        if(sum>0)return sum;
        return max;
    }
}




