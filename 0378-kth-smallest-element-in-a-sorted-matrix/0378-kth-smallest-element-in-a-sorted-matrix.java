class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        
        PriorityQueue<Integer> ans =new PriorityQueue<>(Comparator.reverseOrder());

        for(int nums[] : matrix){
            for(int num : nums){
                ans.add(num);
                if(ans.size()>k){
                    ans.remove();
                }
            }
        }

        return ans.remove();

    }
}