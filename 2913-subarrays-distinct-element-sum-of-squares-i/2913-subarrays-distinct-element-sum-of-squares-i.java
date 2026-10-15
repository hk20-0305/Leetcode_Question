class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int c=nums.size();

        int i=0;
        int j=1;
        while(i<nums.size()){
            HashSet<Integer> s=new HashSet<>();
            s.add(nums.get(i));
            while(j<nums.size()){
                s.add(nums.get(j));
                 c+=(s.size()*s.size());
                j++;
            }
            i++;
            j=i+1;
        }
        return c;
    }
}