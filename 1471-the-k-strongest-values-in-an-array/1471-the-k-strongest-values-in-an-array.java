class Solution {
    public int[] getStrongest(int[] arr, int k) {
        
        int n=arr.length;
        Arrays.sort(arr);
        int[] ans =new int[k];

        if(n==1)return new int[]{arr[0]};

        int m=(n-1)/2;

        int l=0;
        int r=n-1;
        int id=0;
        while(l<=r){
            if(Math.abs(arr[l]-arr[m])>Math.abs(arr[r]-arr[m])){
                ans[id++]=arr[l];
                l++;
            }else if(Math.abs(arr[l]-arr[m])<Math.abs(arr[r]-arr[m])){
                ans[id++]=arr[r];
                r--;
            }else if(Math.abs(arr[l]-arr[m])==Math.abs(arr[r]-arr[m])){
                if(arr[l]>arr[r]){
                    ans[id++]=arr[l];
                    l++;
                }else if(arr[r]>arr[l]){
                    ans[id++]=arr[r];
                    r--;
                }else{
                    ans[id++]=arr[l];
                    l++;
                }
            }

            if(id==k)break;
        }

        return ans;

    }
}