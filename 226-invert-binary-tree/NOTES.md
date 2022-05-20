return root;
}
}
​
​
​
​
​
​
​
​
public TreeNode invertTree(TreeNode root) {
if(root == null){
return root;
}
TreeNode leftSubTree = invertTree(root.left);
TreeNode rightSubTree = invertTree(root.right);
root.left = rightSubTree;
root.right = leftSubTree;
return root;
}
​
​
​
​
​
​
​