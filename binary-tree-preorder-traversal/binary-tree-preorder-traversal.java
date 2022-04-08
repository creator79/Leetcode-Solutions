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
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> ans = new ArrayList<Integer>();
      
      helper (ans, root);
      return ans;
    }
  
public void helper(List<Integer> ans, TreeNode root){
  if (root==null)return;
  
  ans.add(root.val);
  helper(ans,root.left);
  helper(ans,root.right);
}
   
}