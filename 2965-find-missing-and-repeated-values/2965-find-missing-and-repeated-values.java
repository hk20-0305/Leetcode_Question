class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
       
        int n=grid.length;
        int arr[] = new int[2500+1];
    
        int dup = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(arr[grid[i][j]] == 0){
                    arr[grid[i][j]] = 1;
                }else if(arr[grid[i][j]] != 0){
                    dup = grid[i][j];
                }
            }
        }
        for(int i=1; i<=2500; i++){
            if(arr[i] == 0){
                return new int[]{dup,i};
            }
        }

    
       return new int[]{0,0};

    }
}