class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
       
        int n=grid.length;
        int sum=0;
        int dup = 0;
        //  if(n==0)return ans;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum += grid[i][j];
               if(set.contains(grid[i][j])){
                dup = grid[i][j];
               }
               set.add(grid[i][j]);
            }
        }

        sum = sum-dup;
        n= n*n;
        int x = n*(n+1)/2;
        int ans = x-sum;
       return new int[]{dup,ans};

    }
}