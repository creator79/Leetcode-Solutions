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
// bottom up apporach 
// kind of  post order traversal
// class Solution {
//     public int maxDepth(TreeNode root) {
//         if (root==null){
//             return 0;
            
//         }
//       int lh = maxDepth(root.left);
//       int rh = maxDepth(root.right);
        
//         return Math.max(lh,rh)+1;
//     }
// }


// top down apporach
// kind of preorder traversal

class Solution{
  private int answer=0;
   public int maxDepth(TreeNode root) {
    
     maximum_depth(root,0);
     return answer;
   }
  private void maximum_depth(TreeNode root, int depth) {
    if (root == null) {
        return;
    }
    if (root.left == null && root.right == null) {
        answer = Math.max(answer, depth+1);
    }
    maximum_depth(root.left, depth + 1);
    maximum_depth(root.right, depth + 1);
}
  
}


