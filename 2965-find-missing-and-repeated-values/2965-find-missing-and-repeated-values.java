class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
       
        int[] ans=new int[2];
        int idx=0;
        int n=grid.length;
         if(n==0)return ans;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){ans[idx++]=grid[i][j];}else{
                    set.add(grid[i][j]);
                }
            }
        }

       for(int i=1;i<=n*n;i++){
         if(!set.contains(i)){
            ans[idx]=i;
         }
       }

       return ans;

    }
}