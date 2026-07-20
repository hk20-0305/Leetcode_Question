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
    public boolean isValidBST(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        rec(root, ans);

        for (int i = 1; i < ans.size(); i++) {
            if (ans.get(i) <= ans.get(i - 1)) {
                return false;
            }
        }
        return true;

    }

    public void rec(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        rec(root.left, ans);
        ans.add(root.val);
        rec(root.right, ans);
    }
}