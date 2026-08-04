class Solution {
    public int findMinDifference(List<String> tp) {
        
        int[] arr= new int[tp.size()];

        for(int i=0;i<tp.size();i++){
            String st=tp.get(i);

            int x=Integer.parseInt(st.substring(0,2));
            int y=Integer.parseInt(st.substring(3,5));

            if(x==0){
                arr[i]=(24*60)+y;
            }else{
                arr[i]=(x*60)+y;
            }
        }

        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            ans=Math.min(ans,Math.abs(arr[i]-arr[i+1]));
        }
         ans=Math.min(ans,1440-arr[arr.length-1]+arr[0]);
         return ans;
    }
}


