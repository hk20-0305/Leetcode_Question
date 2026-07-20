/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        rec(root, p, path1);
        rec(root, q, path2);

        TreeNode ans = null;

        int n = Math.min(path1.size(), path2.size());

        for (int i = 0; i < n; i++) {
            if (path1.get(i) == path2.get(i)) {
                ans = path1.get(i);
            } else {
                break;
            }
        }

        return ans;
    }

    public boolean rec(TreeNode root, TreeNode target, List<TreeNode> path) {

        if (root == null)
            return false;

        path.add(root);

        if (root == target)
            return true;

        if (rec(root.left, target, path))
            return true;

        if (rec(root.right, target, path))
            return true;

        path.remove(path.size() - 1);

        return false;
    }
}