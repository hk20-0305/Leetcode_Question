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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans = new ArrayList<>();
       
        if(root==null)return ans;
        hasPathSum(root,new ArrayList<>(),ans,targetSum);
        

        return ans;
        

    }
   public void hasPathSum(TreeNode root, List<Integer> curr, List<List<Integer>> ans,int targetSum) {

    if(root==null) return;
        curr.add(root.val);
       if(root.left==null && root.right==null && targetSum==root.val){
            ans.add(new ArrayList<>(curr));
       }else{
           hasPathSum(root.left,curr,ans,targetSum-root.val);
          hasPathSum(root.right,curr,ans,targetSum-root.val);
       }

        curr.remove(curr.size()-1);
        
        
    }
}