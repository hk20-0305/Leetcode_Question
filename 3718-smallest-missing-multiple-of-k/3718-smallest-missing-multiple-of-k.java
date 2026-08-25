class Solution {
    public int missingMultiple(int[] nums, int k) {
        
       HashSet<Integer> set=new HashSet<>();

        for(int x:nums){
            set.add(x);
        }
        int an=0;
        for(int i=1;i<=101;i++){
            if(!set.contains(k*i)){
                an=k*i;
                break;
            }else{
                continue;
            }
        }

        return an;

    }
}