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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> ans=new ArrayList<>();

        hp(root,"",ans);

        

        return ans;

        
        
        

    }
    public void hp(TreeNode root,String str,List<String> rs){

         if(root==null)return;

          if(str.length()==0){
            str+=""+root.val;
          }else{
            str+="->"+root.val;
          }
        if(root.left==null && root.right==null ){
            rs.add(str);
            return;
        }

       hp(root.left,str,rs);
       hp(root.right,str,rs);
    }
}