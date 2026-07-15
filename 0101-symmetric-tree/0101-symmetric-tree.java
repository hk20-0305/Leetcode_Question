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
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)return true;      

    
        return rec(root.left,root.right);
      


    }

    public boolean rec(TreeNode t1 ,TreeNode t2){
        if(t1==null && t2==null)return true;

        if(t1==null || t2==null)return false;

        return (t1.val==t2.val)&&rec(t1.left,t2.right)&&rec(t1.right,t2.left);
    }
}