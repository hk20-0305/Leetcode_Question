/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        

       Queue<TreeNode> q=new LinkedList<>();


        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> at=new ArrayList<>();
            for(int i=0;i<s;i++){
            TreeNode curr=q.remove();
            at.add(curr.val);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
            }

            ans.add(at);

        }

        return ans.get(ans.size()-1).get(0);

    }
}