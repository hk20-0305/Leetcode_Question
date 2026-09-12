class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
         k=k%n;
        rot(nums,0,n-k-1);
        rot(nums,n-k,n-1);
        rot(nums,0,n-1);



    }
    public void rot(int[] arr,int l,int r){

        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }

    }
}