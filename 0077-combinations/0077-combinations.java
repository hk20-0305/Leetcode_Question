class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rs = new ArrayList<>();
        back(1,n,k,new ArrayList<>(),rs);
        return rs;
        
    }

    public void back(int x,int n,int k,List<Integer> an,List<List<Integer>> ans){
    
        if(an.size()==k){
            ans.add(new ArrayList<>(an));
            return;
        }

         for(int i=x;i<=n;i++){
            an.add(i);
            back(i+1,n,k,an,ans);
            an.remove(an.size()-1);
         }
    }
}