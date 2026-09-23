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
    int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int max=Integer.MAX_VALUE;
       return rec(preorder,max);
        
    }
    public TreeNode rec(int[] arr,int max){
        if(idx==arr.length || max<arr[idx]){
            return null;
        }
         TreeNode node=new TreeNode(arr[idx++]);
         node.left=rec(arr,node.val);
         node.right=rec(arr,max);
       return node;

    }
}