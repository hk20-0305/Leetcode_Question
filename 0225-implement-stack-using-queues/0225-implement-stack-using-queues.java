class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if (!q1.isEmpty()) {
            q1.add(x);
        } else {
            q2.add(x);
        }
    }

    public int pop() {
        if (empty())
            return -1;

        if (!q1.isEmpty()) {

            while (q1.size() > 1) {
                q2.offer(q1.poll());
            }

            return q1.poll();

        } else {

            while (q2.size() > 1) {
                q1.offer(q2.poll());
            }

            return q2.poll();
        }
    }

    public int top() {

        if (empty())
            return -1;

        int ans;

        if (!q1.isEmpty()) {

            while (q1.size() > 1) {
                q2.offer(q1.poll());
            }

            ans = q1.poll();
            q2.offer(ans);

        } else {

            while (q2.size() > 1) {
                q1.offer(q2.poll());
            }

            ans = q2.poll();
            q1.offer(ans);
        }

        return ans;

    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */