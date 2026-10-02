class Solution {
    int m,n;
    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {

        m=board.length;
        n=board[0].length;
        char[] w=word.toCharArray();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==w[0] && find(board,i,j,w,0))return true;
            }
        }
      
        return false;
        
        
    }
    public boolean find(char[][] b,int i,int j,char[] w,int id){
        
        if(id==w.length)return true;

        if(i<0 || j<0 || i>=m || j>=n || b[i][j]=='$')return false;

        if(b[i][j]!=w[id])return false;

        char  temp=b[i][j];
        b[i][j]='$';

        for(int[] d:dir){
            int i_=i+d[0];
            int j_=j+d[1];

            if(find(b,i_,j_,w,id+1))return true;
        }

        b[i][j]=temp;

        return false;

    }
    
}