class Solution {
    public int uniquePaths(int m, int n) {
       int c=0;
       int[][] gd = new int[m][n];

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           if(i==0 || j==0){
             gd[i][j]=1;
           }else{
             gd[i][j]=gd[i-1][j]+gd[i][j-1];
           }
        }
       } 
       return gd[m-1][n-1];
    }
}