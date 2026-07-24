class KthLargest {
    PriorityQueue<Integer> ans;
    int k;

    public KthLargest(int k, int[] nums) {

        ans = new PriorityQueue<>();
        this.k = k;

        for (int x : nums) {
            ans.add(x);
             while (ans.size() > k) {
            ans.remove();
        }
        }

    }

    public int add(int val) {
        ans.add(val);
        while(ans.size() > k) {
            ans.poll();
        }
        return ans.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */