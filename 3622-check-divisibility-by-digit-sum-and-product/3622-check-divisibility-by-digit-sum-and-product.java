class Solution {
    public boolean checkDivisibility(int n) {
        int k=n;
        
        int x=0;
        int y=1;
        while(n>0){
            int l=n%10;
            x+=l;
            y*=l;
            n=n/10;
        }

        int sum=x+y;
        
        return k%sum==0;
    }
}