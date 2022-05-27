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
    
       List<String> ans = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
         solution(root,"");
        return ans;

    }
    public void solution(TreeNode root, String str){
   // base case
      if(root.left==null && root.right==null){
        str=str+Integer.toString(root.val);
        ans.add(str);
        return;
    }
    // explore the child 
    // use preorder traversal
        
    str=str+Integer.toString(root.val)+"->";
    if(root.left!=null)  solution(root.left,str); 
    if(root.right!=null) solution(root.right,str); 
        
    }
}