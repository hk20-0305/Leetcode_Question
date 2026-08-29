class Solution {
    public int subarraySum(int[] nums, int k) {
        

        HashMap<Integer,Integer> map = new HashMap<>();

        int l=0;
        int c=0;
        int sum=0;

        map.put(0,1);
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(map.containsKey(sum-k)){
               c+=map.get(sum-k); 
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return c;
    }
}