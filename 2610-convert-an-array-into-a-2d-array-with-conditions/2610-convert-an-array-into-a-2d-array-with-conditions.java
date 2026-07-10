class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
      HashMap<Integer,Integer> map = new HashMap<>();

      for(int i=0;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      }

        List<List<Integer>> ans =new ArrayList<>();

    
        while(true){
            List<Integer> an =new ArrayList<>();
                boolean all=false;
            for(Map.Entry<Integer, Integer> e : map.entrySet()){
                if(e.getValue()>0){
                    an.add(e.getKey());
                    map.put(e.getKey(),e.getValue()-1);
                    all=true;
                }
               
            }
            
            if(!all)break;
             ans.add(an);
        }
        
      
     
        return ans;
    }
}