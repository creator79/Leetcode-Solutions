public TreeNode convertBST(TreeNode root) {
if(root == null) return root;
convertBST(root.right);                  // traverse right
sum += root.val;                         // update sum
root.val = sum;                          // update current node val with sum
convertBST(root.left);                   // traverse left
return root;                             // return root
}
}```
​
​
​
class Solution {
static int val; // initialise of global variable
public TreeNode convertBST(TreeNode root) {
val=0; // global variable for updating value for node in BST
solve(root); // recursion similar to normal traversal like (inOrder,preOrder and postOrder)
return root; // returning the root node
}
public void solve(TreeNode root){
if(root==null)return; // base condition
solve(root.right); // right recursion
val=val+root.val; // updating global variable
root.val=val;  // updating value in node
solve(root.left); // left recursion
}
}