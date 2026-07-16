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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans =new ArrayList<>();
        ino(root,ans);
        return ans.get(k-1);
        
    }
    public List<Integer> ino(TreeNode root,List<Integer> ans){
        if(root==null) return ans;

        ino(root.left,ans);
        ans.add(root.val);
        ino(root.right,ans);

        return ans;

    }
}