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
//    class Solution {

//     public int maxAncestorDiff(TreeNode root) {
//         return this.traverse(root, root.val, root.val); // trick to avoid diff for root element
//     }

//     private int traverse(TreeNode root, int max, int min) {
//         if (root == null) return max - min; // leaf, return result

//         //  calculate new min and max for current tree path including current element
//         var newMax = Math.max(max, root.val);
//         var newMin = Math.min(min, root.val);

//         // visit children
//         var current = newMax - newMin;
//         var left = this.traverse(root.left, newMax, newMin);
//         var right = this.traverse(root.right, newMax, newMin);

//         // return best result
//         return Math.max(current, Math.max(left, right));
//     }
// }


// Recursive Code 
class Solution {
public int maxAncestorDiff(TreeNode root) {
return md(root,root.val,root.val);
}
public int md(TreeNode root, int mn, int mx) {
if (root == null) return mx - mn;
mx = Math.max(mx, root.val);
mn = Math.min(mn, root.val);
return Math.max(md(root.left, mn, mx), md(root.right, mn, mx));
}
}
