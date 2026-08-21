class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0;

        int l=0;
       
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                l++;
            }
             max=Math.max(max,l);

            if(nums[r]==0){
               l=0;
            }
           
        }
        return max;
    }
}