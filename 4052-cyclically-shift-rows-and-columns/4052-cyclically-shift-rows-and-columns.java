class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rows, int[] cols) {   

        
        ls(grid,rows,n);
        us(grid,cols,n);

        return grid;

    }

    public void ls(int[][] g, int[] row,int n) {
         int[][] temp = new int[g.length][n];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                int x = (j - row[i] + n) % n;
                temp[i][x] = g[i][j];
            }
        }

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = temp[i][j];
            }
        }
    }

    public void us(int[][] g, int[] col,int n) {

         int[][] temp = new int[g.length][n];
        for (int j = 0; j < g[0].length; j++) {
            for (int i = 0; i < g.length; i++) {
                int y = (i - col[j] + n) % n;
                temp[y][j] = g[i][j];
            }
        }

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j]=temp[i][j];
            }
        }
    }

}
