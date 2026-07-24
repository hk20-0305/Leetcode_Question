class Solution {
    public int matrixSum(int[][] nums) {

        for (int[] row : nums) {
            Arrays.sort(row);
        }
      int sum = 0;
        for(int i=0;i<nums[0].length;i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<nums.length;j++){
                pq.add(nums[j][i]);
            }
            sum+=pq.peek();
            
        }
        return sum;
    }
}