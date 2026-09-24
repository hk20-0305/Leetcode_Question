class Solution {
    public int rob(int[] nums) {

       int pr1=0;
       int pr2=0;

       for(int num:nums){
        int curr=Math.max(pr1,pr2+num);
        pr2=pr1;
        pr1=curr;
       }
       return pr1;

    }

}