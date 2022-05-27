/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
class Solution {
public List<String> binaryTreePaths(TreeNode root) {
List<Integer> ans = new ArrayList<>();
helper(ans,root);
List<String> list = ans.stream()
.map(s -> String.valueOf(s))
.collect(Collectors.toList());
return list;
​
}
public void helper ( List<Integer> ans,TreeNode root ){
if (root==null)return ;
helper(ans, root.left);
ans.add(root.val);
helper(ans, root.right);
​
}
}