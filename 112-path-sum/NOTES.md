class Solution {
public boolean hasPathSum(TreeNode root, int targetSum) {
// top down apporach
boolean ans = false;
if (root==null) return false;
int subans= targetSum - root.val;
if(subans==0 && root.left==null && root.right==null) return ans = true;
if (root.left!=null){
ans = ans || hasPathSum(root.left,subans);
}
if(root.right!=null){
ans = ans || hasPathSum(root.right,subans);
}
return (ans);
}
}
​
​