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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
          List<List<Integer>> ans =new ArrayList<>();
            
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return ans;
        

        q.add(root);
        while(!q.isEmpty()){
           List<Integer> an=new ArrayList<>();
           int size=q.size();
           for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                an.add(curr.val);
           }   
           ans.add(an);  
        }

        Collections.reverse(ans);

        return ans;
    }
}