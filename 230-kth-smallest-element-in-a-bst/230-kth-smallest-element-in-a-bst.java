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
        ArrayList<Integer> al= new ArrayList<>();
       inorder(root,al,k);
     return al.get(k-1);
    }
  private void inorder(TreeNode root, ArrayList<Integer> al,int k){
    if(al.size()==k){
      return;
    }
       if (root==null) return;
       inorder(root.left,al,k);
       al.add(root.val);
    if(al.size()==k){
      return;
    }
       inorder(root.right,al,k);
    }
}