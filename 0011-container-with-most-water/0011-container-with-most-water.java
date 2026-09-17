class Solution {
    public int maxArea(int[] he) {
        
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=he.length-1;
        while(l<r){

            int min=Math.min(he[l],he[r]);
            int dis=r-l;
            
            max=Math.max(max,min*dis);

            if(he[l]<he[r]){
                    l++;
            }else{
                r--;
            }
            
        }
        return max;
    }
}